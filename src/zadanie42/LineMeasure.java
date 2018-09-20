package zadanie42;

import java.util.Scanner;

public class LineMeasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Line line1 = new Line();
        Line line2 = new Line();
        Point point1 = new Point();
        Point point2 = new Point();
        LineTest lt = new LineTest();

        System.out.println("Program będzie obliczał długości odcinków poprzez odejmowanie odcinka końcowego od początkowego");
        sc.nextLine();
        System.out.println("Proszę podać początek pierwszego odcinka:");
        point1.setStart(sc.nextInt());
        System.out.println("Proszę podać koniec pierwszego odcinka:");
        point1.setEnd(sc.nextInt());
        if (point1.getEnd() - point1.getStart() >= 0) {
            line1.setLenght(point1.getEnd() - point1.getStart());
        } else {
            line1.setLenght((point1.getEnd() - point1.getStart()) * -1);
        }

        System.out.println("Odcinek pierwszy, ze współrzędnymi (" + point1.getStart() + "," + point1.getEnd() + ") ma długość: " + line1.getLenght() + " cm.");
        sc.nextLine();
        System.out.println("Proszę podać początek drugiego odcinka:");
        point2.setStart(sc.nextInt());
        System.out.println("Proszę podać koniec drugiego odcinka:");
        point2.setEnd(sc.nextInt());
        if (point2.getEnd() - point2.getStart() >= 0) {
            line2.setLenght(point2.getEnd() - point2.getStart());
        } else {
            line2.setLenght((point2.getEnd() - point2.getStart()) * -1);
        }
        System.out.println("Odcinek drugi, ze współrzędnymi (" + point2.getStart() + "," + point2.getEnd() + ") ma długość: " + line2.getLenght() + " cm.");
        sc.nextLine();
        sc.nextLine();
        System.out.println(lt.whichIsLonger(line1, line2));
        sc.close();


    }
}
