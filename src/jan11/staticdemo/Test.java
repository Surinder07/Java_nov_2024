package jan11.staticdemo;

public class Test {

    public void show(){ // 3
        System.out.println("Normal method");
    }

    public static void display(){  // 4
        System.out.println("Static method");
    }

    static {  // 1
        System.out.println("Static block ");
    }
    { // 2
        System.out.println("instance block ");
    }
}
