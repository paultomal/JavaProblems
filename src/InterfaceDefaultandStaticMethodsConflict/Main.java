package InterfaceDefaultandStaticMethodsConflict;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
        MyInterface.staticMethod();
    }
}
