public class SynchronizationExercice implements Runnable {

    // I declare every needed variable here (all static because we need to use them in the main() method)
    static SyncBank bank = new SyncBank(200);
    // "amount to withdraw" = "montant a retirer"
    static int amountToWithdraw = 50;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new SynchronizationExercice());
        Thread t2 = new Thread(new SynchronizationExercice());

        // Both threads will run the code in the run() method at the same time
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }

        bank.displayBalance();
    }

    @Override
    public void run() {
        System.out.printf("%s a retiré %d€\n", Thread.currentThread().getName(), amountToWithdraw);
        bank.withdraw(amountToWithdraw);
    }
}
