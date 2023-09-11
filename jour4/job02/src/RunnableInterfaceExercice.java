public class RunnableInterfaceExercice implements Runnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableInterfaceExercice());
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println("En cours d'exécution...");
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Exception: " + e);
                Thread.currentThread().interrupt();
            }
        }
    }
}
