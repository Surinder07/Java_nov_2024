package jan11;


class A {
    public void show(){
        System.out.println("A class method");
    }
}
class B extends A {

    @Override
    public void show(){
        System.out.println("B class method");
    }
}

class C extends B {
    @Override
    public void show(){
        System.out.println("C class method");
    }
}
public class Main {
    public static void main(String[] args) {

        A a = new C();  // assign child class object  to parent class ref
        a.show();
    }
}
