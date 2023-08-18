package ImmutableClass;

public final class ImmutablePoint {
    private final Integer x;

    private final Integer y;

    public ImmutablePoint(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public void area(){
        System.out.println(x);
        System.out.println(y);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

/*    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }*/
}
