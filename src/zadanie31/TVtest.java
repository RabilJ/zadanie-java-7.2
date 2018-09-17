package zadanie31;

import zadanie31.Televisor;

public class TVtest {
    public static void main(String[] args) {
        Televisor tele1 = new Televisor();
        tele1.showStatus();
        tele1.turnOn();
        tele1.showStatus();
        tele1.turnOff();
        tele1.showStatus();

    }
}
