package HierarchicalInheritance;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.calculateArea();
        System.out.println("Circle Area: " + circle.getArea() + " square units");
        System.out.println("Circle Color: " + circle.getColor());
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangle.getArea() + " square units");
        System.out.println("Rectangle Color: " + rectangle.getColor());


    }
}
