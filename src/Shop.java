public class Shop {
    public static void main(String[] args) {


        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        comp1.processor = "Intel Core i5";
        comp1.graphicCard = "Nvidia";
        comp1.memory = 16;

        comp2.processor = "Intel Core i7";
        comp2.graphicCard = "Zotac";
        comp2.memory = 32;

        System.out.println("Comp1: "+comp1.processor+" "+comp1.graphicCard+" "+comp1.memory+"GB");
        System.out.println("Comp2: "+comp2.processor+" "+comp2.graphicCard+" "+comp2.memory+"GB");

    }
}