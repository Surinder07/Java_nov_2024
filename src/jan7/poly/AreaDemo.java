package jan7.poly;

public class AreaDemo {
    public static void main(String[] args) {

       /* Shape shape = new Shape();
        System.out.println( "Area : "+shape.getArea());
*/

        Circle circle = new Circle(2);
       // System.out.println("Area of circle : "+circle.getArea());

        // upcasting ....
        // parent class reference can be assigned to child class object

        Shape shape = new Circle(10);
        System.out.println("Area of Square : "+shape.getArea());

        // Stack                    Heap
        // Shape shape  ---------> new Square();

    }
}
