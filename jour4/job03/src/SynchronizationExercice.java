public class SynchronizationExercice implements Runnable {

    // I declare every needed variable here (all static because we need to use them in the main() method)
    static Banque banque;
    static int amountToWithdraw;

    static Thread t1 = new Thread(new SynchronizationExercice());
    static Thread t2 = new Thread(new SynchronizationExercice());

    public static void main(String[] args) {

        // I initialize every variable
        banque = new Banque(Integer.parseInt(args[0]));
        amountToWithdraw = Integer.parseInt(args[1]);

        // Both threads will run the code in the run() method at the same time
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        System.out.printf("%s a retiré %d€\n", Thread.currentThread(), amountToWithdraw);
        banque.withdraw(amountToWithdraw);

        banque.displayBalance();
    }
}
