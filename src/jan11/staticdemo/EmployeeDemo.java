package jan11.staticdemo;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Sahil", 10000.50,"Full stack developer");
        Employee employee2 = new Employee(102, "Chris", 20000.50,"Senior Manager");
        Employee employee3 = new Employee(103, "Rachna", 30000.50,"Principle Engineer");


        employee1.printEmployee();
        System.out.println();
        employee2.printEmployee();
        System.out.println();
        employee3.printEmployee();
    }
}
