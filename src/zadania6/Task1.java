package zadania6;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            System.out.print(numbers[(numbers.length-1)-i]+" ");
        }
    }
}