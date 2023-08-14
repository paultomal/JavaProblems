package RuntimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[2];
        drawables[0] = new Rectangle(3,4);
        drawables[1] = new Circle(4,2);

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
