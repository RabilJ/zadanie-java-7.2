package zadanie3extra;

public class Computer {
    String name;
    Memory memory;
    Procesor procesor;

    public Computer(String name, Memory memory, Procesor procesor) {
        this.name = name;
        this.memory = memory;
        this.procesor = procesor;
    }

    @Override
    public String toString() {
        return "Nazwa komputera: " + name + "\n" + "Nazwa procesora: " + procesor.producer + "\n" + "Taktowanie procesora: "
                + procesor.timing + "GHz" + "\n" + "Nazwa pamięci: " + memory.producer + "\n" + "Ilość pamięci: " + memory.memoryAmount + "GB" +
                "\n" + "Taktowanie pamięci: " + memory.timing + "GHz";
    }
}
