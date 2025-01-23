package jan21.exceptiondemo;

public class Test {
    public static void main(String[] args) {

        set();
    }

    public static void set(){
        show(); // deadlock
    }

    public static void show(){
        set();
    }
}
// ATM = insufficint balance ,
