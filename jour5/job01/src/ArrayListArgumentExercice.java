import java.util.*;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(List.of(args));

        for(String word : words) {
            System.out.println(word);
        }
    }
}
