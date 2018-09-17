package zadanie3extra;

public class Procesor {
    String producer;
    String model;
    double timing;

    public Procesor(String producer, String model, double timing) {
        this(producer, timing);
        this.model = model;

    }

    public Procesor(String producer, double timing) {
        this.producer = producer;
        this.timing = timing;
    }

}
