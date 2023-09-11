public class SynchronizationExercice implements Runnable {

    static Banque banque;
    static int amountToWithdraw;

    static Thread t1 = new Thread(new SynchronizationExercice());
    static Thread t2 = new Thread(new SynchronizationExercice());

    public static void main(String[] args) {

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
