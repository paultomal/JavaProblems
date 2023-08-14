package RuntimePolymorphism;

public class Circle implements Drawable {
    private int width;
    private int height;

    public Circle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("Circle's width is "+ width + " and height is " + height);
    }
}
