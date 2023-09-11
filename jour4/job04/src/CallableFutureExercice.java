import java.util.concurrent.*;

public class CallableFutureExercice {
    public static void main(String[] args) {

        Integer result;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> r = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                return a * b;
            }
        });

        executor.shutdown();

        try {
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
