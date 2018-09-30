package zadanie7.Drugie;

public class Teacher extends Person{
    private boolean isCool;

    public boolean isCool() {
        return isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }

    public Teacher(String firstName, String lastName, boolean isCool) {
        super(firstName, lastName);
        setCool(isCool);
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Czy nauczyciel jest przyjazny dla uczniów: "+isCool());
    }
}
