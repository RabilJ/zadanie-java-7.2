package zadania6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (i == (numbers.length - 1)) {
                for (int j = 0; j < numbers.length; j++)
                    System.out.print(numbers[(numbers.length - 1) - j] + " ");
            }
        }
    }
}