package HierarchicalInheritance;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public void calculateArea() {
        area = width*height;
        this.setArea(area) ;
    }
}
