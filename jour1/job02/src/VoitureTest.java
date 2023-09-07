public class VoitureTest {

    public static void main(String[] args) {
        Voiture voiture = new Voiture("Volkswagen", "red");

        voiture.start();
        voiture.speedUp(10);
        voiture.speedUp(10);
        voiture.brake();
    }
}
