package ConstructorAccessControl;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Employee.createEmployee("Paul",20_000));
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
