public class SyncBank {

    int balance;

    public SyncBank(int amount) {
        balance = amount;
    }

    public void displayBalance() {
        System.out.printf("Solde actuel: %d€\n", balance);
    }

    public void deposit(int amount) {
        amount = Math.abs(amount);
        balance += amount;
        System.out.printf("%d€ déposés. Nouveau solde: %d€\n", amount, balance);
    }

    public void withdraw(int amount) {
        synchronized (this) {
            amount = Math.abs(amount);
            balance -= amount;
            if (balance < 0) {
                balance += amount;
                System.out.printf("Tentative de retrait de %d€. Solde insuffisant (actuel: %d€).\n", amount, balance);
            }
        }
    }
}
