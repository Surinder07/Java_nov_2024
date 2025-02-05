package feb4.comparator;

import feb4.comparable.Employee;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Mike",44));
        list.add(new Student("Peter",22));
        list.add(new Student("John",12));
        list.add(new Student("Albert",63));
        list.add(new Student("Dan",18));

        // this will sort based on the Name
        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s.getName() + " :  "+s.getAge());
        }

        System.out.println("-------");

        // this will sort based on the Age
        Collections.sort(list, new AgeComparator());

        for (Student s : list) {
            System.out.println(s.getName() + " :  "+s.getAge());
        }


        // create a GradeCompatror
        // A , B , C , D
    }
}
