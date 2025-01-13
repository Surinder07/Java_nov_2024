package jan11.staticdemo;

public class Employee {
    int id;
    String name;
    double salary;
    String designation;
    static String company = "Microsoft";

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void printEmployee(){
        System.out.println( "ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
        System.out.println("Company : "+company);
    }
}
