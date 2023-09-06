import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Etudiant {

    String name;
    // I used an ArrayList because a normal array is too limited
    ArrayList<Integer> grades = new ArrayList<Integer>();

    public Etudiant(String studentName) {
        this.name = studentName;
    }

    public void setGrades(int[] grades) {
        // for each grade in grades
        for(int grade : grades) {
            this.grades.add(grade);
        }
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public int getHighest() {
        // get the highest grade
        Collections.sort(grades);
        // reverse it so we can get the first index (the highest grade)
        Collections.reverse(grades);
        return grades.get(0);
    }

    public int getLowest() {
        // get the lowest grade
        Collections.sort(grades);
        // we can get the first index (the lowest grade)
        return grades.get(0);
    }

    public float getAverage() {
        float avg = 0;
        for(int grade : this.grades) {
            avg += grade;
        }
        return avg / this.grades.size();
    }
}
