public class LambdaArgumentExercice {
    public static void main(String[] args) {

        String word = args[0];
        Integer length = Integer.parseInt(args[1]);

        LambdaInterface lengthCheck = (w, l) -> {
            if(w.length() > l) { return "La chaîne " + w + " a une longueur supérieure à " + l; }
            if(w.length() < l) { return "La chaîne " + w + " a une longueur inférieure à " + l; }
            else { return "La chaîne " + w + " a une longueur égale à " + l; }
        };

        System.out.println(lengthCheck.lengthCheck(word, length));
    }
}
