package zadanie5;

public class Task6Method {
    public boolean checkNumber(int number) {
        if (number < 100) {
            System.out.println("Twoja liczba jest za mała");
            return false;
        } else if (number > 200) {
            System.out.println("Twoja liczba jest za duża");
            return false;
        } else if (number % 3 != 0) {
            System.out.println("Twoja liczba nie jest podzielna przez 3");
            return false;
        } else {
            System.out.println("Twoja liczba jest ok");
            return true;
        }
    }
    }

