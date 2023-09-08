import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOperationExercice {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.stream(args)
                                // converts each arg to an Int
                                .map(Integer::parseInt)
                                // doubles each number
                                .map(n -> n * 2)
                                // filters out numbers greater than 10
                                .filter(n -> n < 10)
                                // converts the stream to a list and put it into the variable
                                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
