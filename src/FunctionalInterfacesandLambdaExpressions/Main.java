package FunctionalInterfacesandLambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> {return a+b;};
        System.out.println(calculator.calculate(5,5));
    }
}
