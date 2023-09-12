import java.util.*;

public class HashSetArgumentExercice {
    public static void main(String[] args) {

        HashSet<String> words = new HashSet<>(List.of(args));
        ArrayList<String> unique = new ArrayList<>();

        for(String word : words) {
            if(!unique.contains(word)) {
                System.out.println(word);
            }
            else {
                unique.add(word);
            }
        }
    }
}
