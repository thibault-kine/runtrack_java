public class EtudiantTest {

    public static void main(String[] args) {
        int[] grades = { 3, 8, 12, 13, 18, 19 };
        Etudiant e = new Etudiant("Daniel");
        e.setGrades(grades);
        e.addGrade(15);

        System.out.println("Nom de l'étudiant: " + e.name);
        System.out.println("Notes: " + e.grades);
        System.out.println("Note la plus haute: " + e.getHighest());
        System.out.println("Note la plus basse: " + e.getLowest());
        System.out.println("Moyenne: " + e.getAverage());
    }
}
