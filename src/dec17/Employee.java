package dec17;

public class Employee {
    // instance variables
    String id;
    String name;
    String email;
    double salary;

    public Employee() {
        System.out.println("Inside the default constructor...");
    }

    public Employee(String id) {
        this();  // calling a default constructor
        System.out.println("Inside the constructor with 1 param");
        this.id = id;
    }

    public Employee(String id, String name) {
        this("101");
        System.out.println("Inside the constructor with 2 param");
        this.id = id;
        this.name = name;
    }


}
