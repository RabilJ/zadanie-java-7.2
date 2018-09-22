package zadanie41;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(6,8,10);
        TriangleMethod tm = new TriangleMethod();

        if(tm.isRightTriangle(triangle1)) {
            System.out.println("Trójkąt jest prostokątny");
        }else{
            System.out.println("Trójkąt nie jest prostokątny");

    }
}
}