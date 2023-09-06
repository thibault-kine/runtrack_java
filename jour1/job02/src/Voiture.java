public class Voiture {

    String brand;
    String color;
    int speed = 0;

    public Voiture(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

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

