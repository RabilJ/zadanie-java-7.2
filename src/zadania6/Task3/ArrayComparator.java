package zadania6.Task3;

import java.util.Arrays;

public class ArrayComparator {
    public boolean compare(int[] numbers, int[] numbers2) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length!=numbers2.length||numbers[i] > numbers2[i]) {
                return false;
            } else if (numbers.length!=numbers2.length||numbers[i] < numbers2[i]) {
                return false;
            }
        }
        return true;
        }
    }
