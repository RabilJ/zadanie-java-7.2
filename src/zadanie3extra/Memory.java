package zadanie3extra;

public class Memory {
    String producer;
    String model;
    int memoryAmount;
    double timing;

    public Memory(String producer, String model, int memoryAmount, double timing) {
        this(producer, memoryAmount, timing);
        this.model = model;

    }

    public Memory(String producer, int memoryAmount, double timing) {
        this.producer = producer;
        this.memoryAmount = memoryAmount;
        this.timing = timing;
    }
}
