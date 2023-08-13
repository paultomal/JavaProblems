package MethodOverloding;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        var math = mathOperations.add(5,5);
        var math1 = mathOperations.add(5.1,5.2);
        System.out.println(math);
        System.out.println(math1);
    }
}
