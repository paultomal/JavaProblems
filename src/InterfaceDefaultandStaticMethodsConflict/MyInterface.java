package InterfaceDefaultandStaticMethodsConflict;

public interface MyInterface {
    //Default Methods
    void myMethod();

    //static method
    static void staticMethod() {
        System.out.println("Static Method");
    }
}
