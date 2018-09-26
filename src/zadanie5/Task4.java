package zadanie5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj współrzędną X:");
        int x = sc.nextInt();
        System.out.println("Podaj współrzędną Y");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Punkt znajduje się w I ćwiartce");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt znajduje się w IV ćwiartce");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt znajduje się w II ćwiartce");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt znajduje się w III ćwiartce");
        }else if(x==0&&y!=0){
            System.out.println("Punkt znajduje się na osi Y");
        }else if(x!=0&&y==0){
            System.out.println("Punkt znajduje się na osi X");
        }else{
            System.out.println("Punkt znajduje się w środku układu współrzędnych");
        }
        sc.close();

    }

}
