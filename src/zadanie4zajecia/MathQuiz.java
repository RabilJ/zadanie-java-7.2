package zadanie4zajecia;

import java.util.Scanner;

public class MathQuiz {
Scanner sc = new Scanner(System.in);

    public boolean question1 () {
        System.out.println("Jaki jest wynik mnożenia 3*5?");
        int answer1 = sc.nextInt();
        if (answer1 == 15) {
            System.out.println("Poprawna odpowiedź!");
            return true;
        } else {
            System.out.println("Zła odpowiedź, spróbuj jeszcze raz!");
            return false;
        }
    }
    public boolean question2 () {
        System.out.println("Jakie jest pole kwadratu o boku 12cm?");
        int answer1 = sc.nextInt();
        if (answer1 == 144) {
            System.out.println("Poprawna odpowiedź!");
            return true;
        } else {
            System.out.println("Zła odpowiedź, spróbuj jeszcze raz!");
            return false;
        }
    }
    public boolean question3 () {
        System.out.println("Jaki jest pierwiastek kwadratowy z 15129?");
        int answer1 = sc.nextInt();
        if (answer1 == 123) {
            System.out.println("Poprawna odpowiedź!");
            return true;
        } else {
            System.out.println("Zła odpowiedź, spróbuj jeszcze raz!");
            return false;
        }
    }



}
