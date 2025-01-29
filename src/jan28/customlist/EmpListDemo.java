package jan28.customlist;

import java.util.ArrayList;
import java.util.List;

public class EmpListDemo {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Kaviya","kaviya@gmail.com", 61));
        emp.add(new Employee(102,"Sahil","sahil@gmail.com", 45));
        emp.add(new Employee(103,"Rachna","rachna@gmail.com", 54));
        emp.add(new Employee(104,"Chris","chris@gmail.com", 48));
        emp.add(new Employee(105,"Mihir","mihir@gmail.com", 66));

        System.out.println(emp);

        // find the employee with age over 60 age ?


    }
}
