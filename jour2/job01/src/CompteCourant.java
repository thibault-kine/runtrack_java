public class CompteCourant extends Banque {

    public CompteCourant(int amount) {
        super(amount);
    }

    @Override
    public void displayBalance() {
        System.out.printf("Solde du compte courant: %d€\n", balance);
    }
}
