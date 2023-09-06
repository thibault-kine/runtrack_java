import java.util.Random;

public class JeuDeDes {

    public static void main(String[] args) {
        Random rand = new Random();
        int d1, d2;
        // pseudo-generates a random number from x (included) to y (excluded)
        d1 = rand.nextInt(1, 7);
        d2 = rand.nextInt(1, 7);

        System.out.printf("Dé 1: %d\nDé 2: %d\nSomme: %d", d1, d2, d1 + d2);
    }
}
