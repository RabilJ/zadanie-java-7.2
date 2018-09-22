package zadanie42;

import java.util.Locale;
import java.util.Scanner;

public class LineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        LineCompare lc = new LineCompare();
        Line line1 = new Line();
        Line line2 = new Line();
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        Point point4 = new Point();
        System.out.println("Podaj współrzędne początku pierwszej linii: ");
        point1.setX(sc.nextDouble());
        point1.setY(sc.nextDouble());
        line1.setStart(point1);
        System.out.println("Podaj współrzędne końca pierwszej linii: ");
        point2.setX(sc.nextDouble());
        point2.setY(sc.nextDouble());
        line1.setEnd(point2);
        System.out.println("Podaj współrzędne początku drugiej linii: ");
        point3.setX(sc.nextDouble());
        point3.setY(sc.nextDouble());
        line2.setStart(point3);
        System.out.println("Podaj współrzędne końca drugiej linii: ");
        point4.setX(sc.nextDouble());
        point4.setY(sc.nextDouble());
        line2.setEnd(point4);

        line1.lenghtCalculator(point1, point2);
        System.out.println("Współrzędne pierwszej linii to: ("+point1.getX()+","+point1.getY()+") i ("+
                        point2.getX()+","+point2.getY()+"), jej długość wynosi: "+line1.getLenght()+" cm");

        line2.lenghtCalculator(point3, point4);
        System.out.println("Współrzędne pierwszej linii to: ("+point3.getX()+","+point3.getY()+") i ("+
                point4.getX()+","+point4.getY()+"), jej długość wynosi: "+line2.getLenght()+" cm");
        sc.nextLine();

        System.out.println("Linia o długości: "+ lc.compareLines(line1, line2).getLenght()+" cm, jest dłuższa");
    }
}
