package zadanie4zajecia;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        numbersModel nm = new numbersModel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę A:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj liczbę B:");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj liczbę C:");
        int c = sc.nextInt();

        System.out.println("Największa liczba to: "+nm.greatest(a,b,c));

        System.out.println("Najmniejsza liczba to: "+nm.lowest(a,b,c));

        System.out.println("Srednia z tych liczb to: "+nm.average(a,b,c));



    }
}