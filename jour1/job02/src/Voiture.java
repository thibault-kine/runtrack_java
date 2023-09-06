public class Voiture {

    static int speed = 0;

    public static void main(String[] args) {
        start();
        speedUp();
        speedUp();
        brake();
    }

    public static void start() {
        System.out.println("La voiture démarre.");
    }

    public static void speedUp() {
        speed += 10;
        System.out.printf("La vitesse est maintenant %dkm/h.\n", speed);
    }

    public static void brake() {
        speed = 0;
        System.out.printf("La voiture s'arrête. Vitesse réinitialisée à %dkm/h.\n", speed);
    }
}
