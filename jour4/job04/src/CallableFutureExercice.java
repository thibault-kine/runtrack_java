import java.util.concurrent.*;

public class CallableFutureExercice {
    public static void main(String[] args) {

        Integer result;
        // Creates a single-threaded executor (a "box" of threads)
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Creates a promise of sending the result ("async" statement)
        Future<Integer> r = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // Just basic math
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                return a * b;
            }
        });

        // Tells the executor that we don't need him anymore
        executor.shutdown();

        try {
            // Basically an "await" statement
            result = r.get();
            System.out.printf("Résultat de la multiplication: %d", result);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
