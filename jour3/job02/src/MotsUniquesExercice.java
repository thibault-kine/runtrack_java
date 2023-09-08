import java.util.ArrayList;
import java.util.Arrays;

public class MotsUniquesExercice {
    public static void main(String[] args) {

        // initialize the list by converting the args to a list
        ArrayList<String> liste = new ArrayList<>(Arrays.asList(args));

        ArrayList<String> unique = new ArrayList<>();
        // fill the unique list with the unique words
        for(String word : liste) {
            // if the unique list doesn't contain a word yet, add it
            if(!unique.contains(word)) unique.add(word);
            // else, remove it
            else unique.remove(word);
        }

        System.out.println("Mots uniques: " + unique);
    }
}
