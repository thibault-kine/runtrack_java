public class DivisionExercice {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try {
            if(b == 0) throw new DivisionParZeroException();
            System.out.println(a / b);
        }
        catch (Exception e) {
            System.out.println("Erreur: " + e);
        }
    }
}
