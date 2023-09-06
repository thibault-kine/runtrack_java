import java.util.Scanner;

public class Calculatrice {

    static int a, b;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le premier nombre: ");
        a = input.nextInt();
        System.out.print("Entrez le second nombre: ");
        b = input.nextInt();

        float sum = a + b;
        float diff = a - b;
        float prod = a * b;
        float div = (float) a / b; // exceptionally, I have to explicitly cast the result to a float

        System.out.printf("Somme: %f\n", sum);
        System.out.printf("Différence: %f\n", diff);
        System.out.printf("Produit: %f\n", prod);
        System.out.printf("Division: %f\n", div);
    }
}
