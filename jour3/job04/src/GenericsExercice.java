public class GenericsExercice {
    public static void main(String[] args) {

        Boite<Integer> box = new Boite<>();
        for(String arg : args) {
            box.addContent(Integer.parseInt(arg));
        }

        System.out.println("Contenu de la boîte: " + box.getAllContent());
    }
}
