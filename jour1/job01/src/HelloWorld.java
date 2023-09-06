import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // a Scanner is a way to read from external sources (input, files...)
        String name;

        System.out.print("Veuillez saisir votre nom: ");
        name = input.nextLine(); // reads the next line
        System.out.printf("Hello %s", name);
    }
}
