package zadanie32;

public class ShapeTest {
    public static void main(String[] args) {
        Square square1 = new Square(8.1);
        Rectangle rectangle1 = new Rectangle(5.4,6.5);
        Triangle triangle1 = new Triangle(2.4,2.5);
        Circle circle1 = new Circle(5.7);
        ShapeCalculator sh = new ShapeCalculator();

        System.out.println("Pole kwadratu: "+square1.calculateArea()+" cm2");
        System.out.println("Pole prostokąta: "+rectangle1.calculateArea()+" cm2");
        System.out.println("Pole trójkąta: "+triangle1.calculateArea()+" cm2");
        System.out.printf("Pole koła: %.2f cm2",circle1.calculateArea());
    }
}
