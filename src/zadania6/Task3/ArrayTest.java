package zadania6.Task3;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator ac = new ArrayComparator();
        int[]numbers={1,2,7,4,5};
        int[]numbers2={1,2,3,4,5};

        System.out.println(ac.compare(numbers,numbers2));

    }
}
