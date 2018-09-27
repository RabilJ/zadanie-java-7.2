package zadanie4zajecia;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        MathQuiz mq = new MathQuiz();
        Scanner sc = new Scanner(System.in);
        mq.question1();
        sc.nextLine();
        mq.question2();
        sc.nextLine();
        mq.question3();
        sc.close();

    }
}
