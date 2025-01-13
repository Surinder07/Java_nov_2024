package jan11.encap;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student(101, "Sahil","Java");

        System.out.println( "Student before updating "+student);
        student.setName("Chris");


        System.out.println( "Student after updating "+student);
        System.out.println(student);
    }
}
