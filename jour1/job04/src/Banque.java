public class Banque {

    static int balance = 100;

    public static void main(String[] args) {
        displayBalance();
        deposit(30);
        withdraw(50);
        displayBalance();
    }

    public static void displayBalance() {
        System.out.printf("Solde actuel: %d€\n", balance);
    }

    public static void deposit(int amount) {
        amount = Math.abs(amount);
        balance += amount;
        System.out.printf("%d€ déposés. Nouveau solde: %d€\n", amount, balance);
    }

    public static void withdraw(int amount) {
        amount = Math.abs(amount);
        balance -= amount;
        if(balance < 0) {
            balance += amount;
            System.out.printf("Tentative de retrait de %d€. Solde insuffisant (actuel: %d€).\n", amount, balance);
        }
        else {
            System.out.printf("%d€ retirés. Nouveau solde: %d€\n", amount, balance);
        }
    }
}
