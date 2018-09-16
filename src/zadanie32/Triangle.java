package zadanie32;

public class Triangle {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }
}
