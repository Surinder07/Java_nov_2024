package jan18.interf;


interface A {
    void show();
}
interface B {
    void show();
}

class Test {

}
class C extends Test implements A, B {
    @Override
    public void show() {
        System.out.println("show method");
    }
}

public class TestMain {
    public static void main(String[] args) {

        C c = new C();
        c.show();
    }
}
