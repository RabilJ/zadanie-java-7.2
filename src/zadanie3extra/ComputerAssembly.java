package zadanie3extra;

public class ComputerAssembly {

    public Computer assembly(String name, String procesorName, double procesorTiming, String memoryName, int memoryAmount, double memoryTiming) {
        Procesor proc = new Procesor(procesorName, procesorTiming);
        Memory mem = new Memory(memoryName, memoryAmount, memoryTiming);
        Computer comp = new Computer(name, mem, proc);
        return comp;
    }

}
