package assignments.solution;

class Student extends Person {
    private String studentId;
    private String course;
    private double gpa;

    public Student(String name, int age, String studentId, String course, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
}
