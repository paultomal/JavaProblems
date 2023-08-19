package ConstructorAccessControl;

public class Employee {

    private String name;

    private Integer salary;

    private Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
    public static Employee createEmployee(String name, Integer salary){
        if(name == null || salary < 0) {
            throw new IllegalArgumentException("Invalid name or salary");
        }
        else return new Employee(name,salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
