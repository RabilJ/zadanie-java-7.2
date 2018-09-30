package zadanie7.Drugie;

public class Student extends Person {
    private double averageGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(String firstName, String lastName, double averageGrade) {
        super(firstName, lastName);
        setAverageGrade(averageGrade);
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Średnia ocen: "+getAverageGrade());
    }

}
