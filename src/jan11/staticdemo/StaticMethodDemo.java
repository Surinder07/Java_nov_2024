package jan11.staticdemo;

public class StaticMethodDemo {
    public static void show(){
        System.out.println("Inside show method");
    }

    public void display(){
        System.out.println("Inside display method");
    }


    // precedence of all
    static {
        System.out.println("Inside static block ");
    }

    // instance block
    // this belongs to the object of the class
    {
        System.out.println("Inside instance block ");
    }

}
