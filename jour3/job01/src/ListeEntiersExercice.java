import java.util.ArrayList;

public class ListeEntiersExercice {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        for(String arg : args) {
            liste.add(Integer.parseInt(arg));
        }

        int evenSum = 0;
        for(int n : liste) {
            if(n % 2 == 0) evenSum += n;
        }

        System.out.printf("Somme des nombres pairs: %d\n", evenSum);
    }
}
