import java.util.concurrent.*;

public class CallableFutureExercice {
    public static void main(String[] args) {

        int result;
        // Creates a single-threaded executor (a "box" of threads)
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Creates a promise of sending the result ("async" statement)
        // A Callable is an async function
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // Just basic math
//                int a = Integer.parseInt(args[0]);
                int a = 5;
//                int b = Integer.parseInt(args[1]);
                int b = 6;
                return a * b;
            }
        });

        // Tells the executor that we don't need him anymore
        executor.shutdown();

        try {
            // Basically an "await" statement
            result = future.get();
            System.out.printf("Résultat de la multiplication: %d", result);
        } catch (ExecutionException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
