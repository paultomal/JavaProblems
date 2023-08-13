package HierarchicalInheritance;

public class Shape {
    private String color;

    double area;
    public Shape(String color) {
        this.color = color;
    }

    public void calculateArea(){
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


}
