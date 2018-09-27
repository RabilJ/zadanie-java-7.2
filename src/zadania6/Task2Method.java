package zadania6;

public class Task2Method {

    public int addEachSingleNumber(int number){
        int sum = 0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
