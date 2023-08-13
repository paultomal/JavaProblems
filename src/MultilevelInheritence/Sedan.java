package MultilevelInheritence;

public class Sedan extends Car{
    private int numDoors;
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("MultilevelInheritence.Sedan engine started.");
    }
}
