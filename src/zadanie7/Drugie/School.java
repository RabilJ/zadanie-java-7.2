package zadanie7.Drugie;

public class School {
    public static void main(String[] args) {
        Person student1 = new Student("Jan","Korbacz",4.7);
        Person teacher1 = new Teacher("Marek","Salmarski",false);

        student1.showInfo();
        System.out.println(" ");
        teacher1.showInfo();
    }
}
