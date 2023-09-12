import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectExercice {
    public static void main(String[] args) {

        // number to refer to
        int reference = Integer.parseInt(args[0]);
        ArrayList<Integer> numbers = new ArrayList<>();

        // since the first entry needs to be a reference, i have to skip it in a for loop, instead of doing a foreach
        for(int i = 1; i < args.length; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }

        List<Integer> newNumbers =
                numbers.stream()
                    // filters out any number bigger than the reference
                    .filter(n -> n < reference)
                    .toList();

        System.out.printf(
                "Nombres inférieurs à %d: %s\n",
                reference,
                newNumbers.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );
    }
}
