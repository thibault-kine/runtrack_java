public class ErreursExercices {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try {
            System.out.println("Résultat de la division" + (a / b));
        }
        catch(ArithmeticException e) {
            System.out.println("Erreur: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur: " + e);
        }
        catch(NullPointerException e) {
            System.out.println("Erreur: " + e);
        }
    }
}
