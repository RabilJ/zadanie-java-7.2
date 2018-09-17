package zadanie3extra;

public class Overclock {
    public void increaseCpuClock(Computer comp, double speedUp) {
        comp.procesor.timing = comp.procesor.timing + speedUp;
    }

    public void decreaseCpuClock(Computer comp, double slowDown) {
        comp.procesor.timing = comp.procesor.timing - slowDown;
    }
}
