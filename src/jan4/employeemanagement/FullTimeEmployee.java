package jan4.employeemanagement;

public class FullTimeEmployee extends Employee{

    double payRate = 10.23;
    double hoursWorked = 40;

    @Override
    public double calculateSalary() {
        return payRate * hoursWorked;
    }

    public void printEmployeeDetails(){
        System.out.println("EMPLOYEE  " + name);
        System.out.println("PAY RATE  " + payRate);
        System.out.println(calculateSalary());

    }
}
