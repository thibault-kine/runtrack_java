public class CompteEpargne extends Banque {

    int interest;

    public CompteEpargne(int amount) {
        super(amount);
    }

    @Override
    public void displayBalance() {
        System.out.printf("Solde du compte épargne: %d€ avec un taux d'intérêt de %d%\n", balance, interest);
    }

    public void addInterest(int amount) {
        interest += Math.abs(amount);
        int addedInterest = (amount * balance) / 100;
        amount += addedInterest;
        System.out.printf("Intérêts ajoutés: %d€. Nouveau solde: %d€\n", addedInterest, amount);
    }
}
