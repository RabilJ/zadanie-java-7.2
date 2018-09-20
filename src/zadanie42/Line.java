package zadanie42;

public class Line {
    private int lenght;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Odcinek "+getLenght()+" cm jest dłuższy";
    }
}
