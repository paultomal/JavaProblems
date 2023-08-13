package HierarchicalInheritance;

public class Circle extends Shape {
    private double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        // Calculate area of a circle: π * r^2
        area = Math.PI * radius * radius;
        this.setArea(area) ;
    }
}
