import java.util.concurrent.*;

public class ExecutorServiceExercice {
    public static void main(String[] args) {

        int factor = Integer.parseInt(args[0]);

        ExecutorService executor = Executors.newSingleThreadExecutor();

        for(int i = 1; i <= 3; i++) {
            int x = i;
            executor.submit(new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    int prod = x * factor;
                    System.out.printf("Résultat de la tâche %d: %d\n", x, prod);
                    return null;
                }
            });
        }

        executor.shutdown();
    }
}
