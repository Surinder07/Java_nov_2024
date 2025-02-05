package feb4.comparable;

import feb4.comparable.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Employee e1 = new Employee("Mike", 23);
        Employee e2 = new Employee("Peter", 54);
        Employee e3 = new Employee("Emma", 14);
        Employee e4 = new Employee("Mathew", 19);
        Employee e5 = new Employee("John", 44);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list);
       // System.out.println(list);

        for (Employee e : list) {
            System.out.println(e.getName() + " :  "+e.getAge());
        }
    }
}
