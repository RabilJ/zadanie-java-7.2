package zadanie5;

public class Task5 {
    public static void main(String[] args) {
        int number =0;
        int sum = 0;
        while(number<=100){
            System.out.println(number);
            sum = sum+number;
            number=number+2;


        }
        System.out.println("Suma liczb parzystych w przedziale 0-100: "+sum);
    }
}
