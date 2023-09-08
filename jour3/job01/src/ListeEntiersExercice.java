import java.util.ArrayList;

public class ListeEntiersExercice {
    public static void main(String[] args) {

        // create a new list of Integers
        ArrayList<Integer> liste = new ArrayList<>();
        // for each argument in args
        for(String arg : args) {
            // cast the arg to an int and add it to the list
            liste.add(Integer.parseInt(arg));
        }

        int evenSum = 0;
        for(int n : liste) {
            // if the number is even, add it to the total sum
            if(n % 2 == 0) evenSum += n;
        }

        System.out.printf("Somme des nombres pairs: %d\n", evenSum);
    }
}
