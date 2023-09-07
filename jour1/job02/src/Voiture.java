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

    public void speedUp(int speedAmount) {
        try {
            speed += speedAmount;
            if(speed > 100) throw new VitesseLimiteDepasseeException();
            System.out.printf("La vitesse est maintenant %dkm/h.\n", speed);
        }
        catch(Exception e) {
            System.out.println("Erreur: " + e);
        }
    }

    public void brake() {
        speed = 0;
        System.out.printf("La voiture s'arrête. Vitesse réinitialisée à %dkm/h.\n", speed);
    }
}

