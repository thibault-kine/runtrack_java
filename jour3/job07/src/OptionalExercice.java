import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExercice {
    public static void main(String[] args) {

        try {
            Optional<String> wordOptional = Optional.of(args[0]);
            wordOptional.ifPresent(val -> System.out.println("Longueur de la chaine: " + val.length()));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // if nothing is in args[0]
            System.out.println("Chaine non fournie");
        }
    }
}
