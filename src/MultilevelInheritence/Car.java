public class Car extends Vehicle{
    private String model;
    public void startEngine(){
        super.startEngine();
        System.out.println("Car's Engine started");
    }
}
