public class VoitureExercice {

    public static void main(String[] args) {
        Voiture v = new Voiture("Volvo", "black");

        v.speedUp(Integer.parseInt(args[0]));
    }
}
