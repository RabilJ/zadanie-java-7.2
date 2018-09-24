package zadanie5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]names = new String[5];
        for(int i=0;i<names.length;i++){
            System.out.println("Podaj imię");
            names[i] = sc.nextLine();
        }
        for(int i=4;i>=0;i--){
            System.out.println("Cześć "+names[i]);

        }

    }
}
