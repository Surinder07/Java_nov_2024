package jan21.anonymousinner;

public class StudentMain {
    public static void main(String[] args) {

       /* Student student = new MathsStudent();
        student.read();
        student.run();
        student.sleep();*/


        // this is not the object of Student class
        // there is a class present which gives the implementation of the Student class
        // but there is no name present
        Student student = new Student() {
            @Override
            public void read() {
                System.out.println("read mathematics..");
            }

        };

        student.read();

        // this can be converted into lambda when we learn Java 8 features

        Mobile mobile = new Mobile(){

            @Override
            public void surfInternet() {

            }
        };
        mobile.surfInternet();
    }
}
// 10 mins
// Restaurant class - cook()
// create Annoymous Implementation of that method
// Main class
