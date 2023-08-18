package InterfaceDefaultandStaticMethodsConflict;

public class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("My Method Is Called");
    }

    //Avoid overriding static method from the interface.
    //Always prefer default method to override

    /*
    public static void staticMethod() {
        System.out.println("Static Method in My Class");
    }
*/

}
