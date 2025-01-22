package assignments.solution;

public class Solution {
    public static void main(String[] args) {

        University.setUniversityName("Global Tech University");


        Person[] people = new Person[3];

        people[0] = new Student("Alice Smith", 20, "S12345", "Computer Science", 3.9);
        people[1] = new Professor("Dr. John Doe", 45, "P67890", "Software Engineering", 95000);
        people[2] = new DepartmentHead("Dr. Sarah Lee", 50, "P98765", "Computer Science", 120000, "A-105");


        for (Person person : people) {
            person.displayInfo();
            System.out.println();

            if (person instanceof Student) {
                University.incrementStudentCount();
            } else if (person instanceof Professor) {
                University.incrementProfessorCount();
            }
        }

        University.getStatistics();
    }
}

