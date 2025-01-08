package jan4.employeemanagement;

public class Employee {
    int id;
    String name;
    double payRate;
    double hoursWorked;

    public Employee() {
    }

    public Employee(int id, String name, double payRate, double hoursWorked) {
        this.id = id;
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return payRate * hoursWorked;
    }
}
