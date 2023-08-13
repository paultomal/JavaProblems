package Lambdas;

public class LambdasDemo {
    public static void show(){
        // passing lemda expression as a argument to a method
        greet(message -> System.out.println(message));
        /*greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });*/
    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
