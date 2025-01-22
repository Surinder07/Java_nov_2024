package assignments.solution;

class Professor extends Person {
    private String employeeId;
    private String department;
    private double salary;

    public Professor(String name, int age, String employeeId, String department, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + String.format("%.2f", salary));
    }
}
