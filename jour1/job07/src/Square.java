public class Square {

    int size;

    public Square(int size) {
        this.size = size;
    }

    public double getArea() {
        // formula: size * 4 (4 sides of the same size)
        return size * 4;
    }
}
