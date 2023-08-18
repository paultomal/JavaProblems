package CovariantReturnType;

public class Car extends Vehicle {
    @Override
    public Car getInstance() {
        return new Car();
    }
}
