package zadanie5;

public class Task5 {
    public static void main(String[] args) {
        int number =0;
        int sum = 0;
        while(number<=100){
            if(number%2!=0){
                number++;
                continue;
            }
            System.out.println(number);
            sum = sum+number;
            number++;


        }
        System.out.println("Suma liczb parzystych w przedziale 0-100: "+sum);
    }
}
