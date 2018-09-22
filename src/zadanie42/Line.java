package zadanie42;

public class Line {
    private Point start;
    private Point end;
    private double lenght;

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double getLenght() {
        return lenght;
    }
    public double lenghtCalculator(Point point1, Point point2){
        double lenght = Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+
                Math.pow(point2.getY()-point1.getY(),2));
        setLenght(lenght);
        return lenght;
    }
}
