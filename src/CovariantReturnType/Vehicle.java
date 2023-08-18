package CovariantReturnType;

public class Vehicle {
    public int a = 1;
    public Vehicle getInstance(){
        return new Vehicle();
    }
}
