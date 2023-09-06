public class Voiture {

    int speed = 0;

    public void start() {
        System.out.println("La voiture démarre.");
    }

    public void speedUp() {
        speed += 10;
        System.out.printf("La vitesse est maintenant %dkm/h.\n", speed);
    }

    public void brake() {
        speed = 0;
        System.out.printf("La voiture s'arrête. Vitesse réinitialisée à %dkm/h.\n", speed);
    }
}

