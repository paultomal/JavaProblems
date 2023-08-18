package ImmutableClass;

public class Main {
    public static void main(String[] args) {
        ImmutablePoint immutablePoint = new ImmutablePoint(4,4);
        immutablePoint.area();
        //if I tired to modify coordinates, it will show compilation error. cause we can access them
        // but cannot change them.
        //immutablePoint.getX() = 5;
    }
}
