public class Televisor {
    String status = "OFF";


    public void turnOn(){
        status = "ON";
    }
    public void turnOff(){
        status = "OFF";
    }
    public void showStatus(){
        System.out.println("Telewizor jest: "+status);
    }

}
