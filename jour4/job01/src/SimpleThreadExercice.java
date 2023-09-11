public class SimpleThreadExercice extends Thread {
    public static void main(String[] args) {

        Thread thread = new Thread(new SimpleThreadExercice());
        // I use thread.start() for async purposes. thread.run() is not asynchronous!
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println("Salut du thread!");
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                // For some reason, Thread.sleep() throws an Exception
                System.out.println("Exception: " + e);
                // So we have to interrupt the thread in case the Exception is thrown
                Thread.currentThread().interrupt();
            }
        }
    }
}
