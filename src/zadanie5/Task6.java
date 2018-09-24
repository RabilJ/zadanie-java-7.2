package zadanie5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task6Method tm = new Task6Method();
        System.out.println("Wprowadź liczbę w przedziale 100-200 oraz podzielną przez 3: ");
        int number = sc.nextInt();
        while(tm.checkNumber(number)!=true){
            System.out.println("Spróbuj ponownie");
            number = sc.nextInt();
        }
    }
}