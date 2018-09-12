public class Computer {

    String processor;
    String graphicCard;
    int memory;

    public Computer(String proc, String graph, int mem){
        processor = proc;
        graphicCard = graph;
        memory = mem;
    }

    @Override
    public String toString() {
        return processor+' '+graphicCard+' '+memory+"GB";
    }
}
