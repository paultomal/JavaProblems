package MultilevelInheritence;

public class Car extends Vehicle{
    private String model;
    public void startEngine(){
        super.startEngine();
        System.out.println("MultilevelInheritence.Car's Engine started");
    }
}
