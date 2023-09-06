public class FormesTest {

    public static void main(String[] args) {
        Circle c = new Circle(7);
        Square s = new Square(3);

        System.out.printf("Aire du cercle de rayon %d: %f\n", c.radius, c.getArea());
        System.out.printf("Aire du carré de côté %d: %f\n", s.size, s.getArea());
    }
}
