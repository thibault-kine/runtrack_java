public class Circle {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        // formula: area = pi * radius^2
        return Math.PI * Math.pow(radius, 2);
    }
}
