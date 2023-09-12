import java.util.HashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args) {

        HashMap<String, String> data = new HashMap<>();

        // if args.length is even (can be paired)
        if(args.length % 2 == 0) {
            for(int i = 0; i < args.length; i++) {
                // if i is even, it's a key. else, it's a value
                if(i % 2 == 0) {
                    data.put(args[i], args[i + 1]);
                    // increment so it skips the next arg
                    i++;
                }
            }
        }

        data.forEach((k, v) -> {
            System.out.printf("%s: %s\n", k, v);
        });
    }
}
