import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterExercice {
    public static void main(String[] args) {

        // number to refer to
        int reference = Integer.parseInt(args[0]);
        ArrayList<Integer> numbers = new ArrayList<>();

        // since the first entry needs to be a reference, i have to skip it in a for loop, instead of doing a foreach
        for(int i = 1; i < args.length; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }

        String numbersString =
                numbers.stream()
                        // filters out any number smaller than the reference
                        .filter(n -> n > reference)
                        // convert the object to a String
                        .map(Object::toString)
                        // collect them and separate them with a ", " in-between
                        .collect(Collectors.joining(", "));

        System.out.printf("Nombres supérieurs à %d: %s\n", reference, numbersString);
    }
}
