import java.util.*;

public class EtudiantMapExercice {
    public static void main(String[] args) {

        HashMap<Integer, String> unsortedStudents = new HashMap<>();
        unsortedStudents.put(22, "Joseph");
        unsortedStudents.put(23, "Sandra");
        unsortedStudents.put(8, "Alex");
        unsortedStudents.put(75, "Stéphane");
        unsortedStudents.put(11, "Issa");

        // create a TreeMap with a Comparator that sorts by keys
        TreeMap<Integer, String> sortedStudents = new TreeMap<>(new Comparator<Integer>() {
            @Override
            // use the compare() method to sort by ascending order
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        // pass the unsortedStudents into the compare() method and put them in sortedStudents
        sortedStudents.putAll(unsortedStudents);
        // create a new HashMap for the sortedStudents
        HashMap<Integer, String> students = new HashMap<>(sortedStudents);

        // everyone is sorted by their keys
        students.forEach((k, v) -> System.out.printf("%d: %s\n", k, v));
    }
}
