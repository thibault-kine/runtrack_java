import java.util.Scanner;

public class CalculatriceTest {

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez un premier nombre: ");
        calc.a = scan.nextInt();
        System.out.print("Entrez un second nombre: ");
        calc.b = scan.nextInt();

        System.out.printf("Somme: %d\n", calc.addition());
        System.out.printf("Différence: %d\n", calc.soustraction());
        System.out.printf("Produit: %f\n", calc.multiplication());
        System.out.printf("Division: %f\n", calc.division());
    }
}
