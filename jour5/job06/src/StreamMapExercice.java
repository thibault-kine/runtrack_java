import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of(args));
        System.out.println(
                names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "))
        );
    }
}
