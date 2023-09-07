public class BanqueExercice {
    public static void main(String[] args) {

        CompteCourant cc = new CompteCourant(Integer.parseInt(args[0]));
        cc.displayBalance();
        CompteEpargne ce = new CompteEpargne(Integer.parseInt(args[1]));
        cc.displayBalance();
        ce.addInterest(Integer.parseInt(args[2]));
    }
}
