package zadanie42;

public class LineCompare {

    public Line compareLines(Line line1, Line line2) {
        if (line1.getLenght() > line2.getLenght()) {
            return line1;
        } else {
            return line2;
        }


    }


}
