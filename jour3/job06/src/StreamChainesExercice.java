import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    public static void main(String[] args) {

        List<String> words = Arrays.stream(args)
                             // filters out any word that doesn't begin with 'a' or 'A'
                             .filter(a -> a.charAt(0) == 'a' || a.charAt(0) == 'A')
                             // filters out any of those words that are not 3 characters long
                             .filter(a -> a.length() == 3)
                             // convert it into a list
                             .toList();

        System.out.println("Mots filtrés: " + words);
    }
}
