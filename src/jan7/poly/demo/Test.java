package jan7.poly.demo;

class A {

    int i = 10;
    {
        System.out.println("Inside instance block A ");
    }
}

class B extends A {
    int i = 20;
    {
        System.out.println("Inside instance block B ");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
    }

}
