public class BanqueTest {

    public static void main(String[] args) {
        Banque banque = new Banque(100);
        banque.displayBalance();
        banque.deposit(70);
        banque.withdraw(55);
        banque.displayBalance();
    }
}
