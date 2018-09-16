package zadanie32;

public class ShapeTest {
    public static void main(String[] args) {
        Square square1 = new Square(8.1);
        Rectangle rectangle1 = new Rectangle(5.4,6.5);
        Triangle triangle1 = new Triangle(2.4,2.5);
        Circle circle1 = new Circle(5.7);
        ShapeCalculator sh = new ShapeCalculator();

        System.out.println("Pole kwadratu: "+sh.squareArea(square1)+" cm2");
        System.out.println("Pole prostokąta: "+sh.rectangleArea(rectangle1)+" cm2");
        System.out.println("Pole trójkąta: "+sh.triangleArea(triangle1)+" cm2");
        System.out.println("Pole koła: "+sh.circleArea(circle1)+" cm2");
    }
}
