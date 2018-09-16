package zadanie32;

public class ShapeCalculator {

    public double squareArea(Square square){

        return square.a*square.a;
    }
    public double rectangleArea(Rectangle rectangle){
        return rectangle.a*rectangle.b;
    }
    public double triangleArea(Triangle triangle){
        return (triangle.base*triangle.height)/2;
    }
    public double circleArea(Circle circle){
        return 3.14*circle.radius*circle.radius;
    }

}
