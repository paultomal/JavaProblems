package DynamicMethodDispatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal.makeSound();
        animal1.makeSound();*/

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for (Animal animal : animals)
            animal.makeSound();
    }
}
