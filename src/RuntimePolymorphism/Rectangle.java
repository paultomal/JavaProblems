package RuntimePolymorphism;

public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Rectangle's width: " + width + " and height: " + height);
    }
}
