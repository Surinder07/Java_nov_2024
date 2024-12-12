package dec7;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    private String empName;
    private int empSal;

    public Employee(String empName, int empSal)
    {
        this.empName = empName;
        this.empSal = empSal;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public int getEmpSal()
    {
        return empSal;
    }

    public void setEmpSal(int empSal)
    {
        this.empSal = empSal;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}

public class Testing {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        //Adding employees in list
        for(int i = 0 ; i < 5; i++) {
            Employee emp = new Employee(i+"", 10 * (i + 1));
            employeeList.add(emp);
        }
        //employeeList.stream(index => new Employee());
        //Sorting employees in descending order based on salary.
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2)
            {
                return emp2.getEmpSal() - emp1.getEmpSal();
            }
        });

        //highest salary emp
        if(employeeList.size() > 0) {
            System.out.println(employeeList.get(0));
        }

        //second-highest salary emp
        if(employeeList.size() > 2)
        {
            System.out.println(employeeList.get(1));
        }
    }
}
