package jan11.finaldemo;

public class Test {
     int x = 10;

    public int show(){
        this.x = 20;
        return x;
    }
}

class Demo extends Test {
    int x = 220;

    @Override
    public int show() {
        System.out.println(super.x);
        return x;
    }
}

class Main1 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}