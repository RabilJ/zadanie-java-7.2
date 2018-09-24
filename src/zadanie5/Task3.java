package zadanie5;

public class Task3 {
    public static void main(String[] args) {
        double number = 0;
        double number2 = 0;
        System.out.println("Pętle while");
        while (number < 3.1) {
            System.out.printf("%.1f \n", number);
            number = number + 0.1;
        }
        System.out.println("Pętla do while");
        do {
            System.out.printf("%.1f \n", number2);
            number2 = number2 + 0.1;
        } while (number2 < 3.1);
    }
}
