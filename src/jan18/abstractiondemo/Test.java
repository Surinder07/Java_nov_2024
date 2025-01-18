package jan18.abstractiondemo;

public class Test {
    int id;

    private Test(int id) {
        this.id = id;
    }

    // write a method which returns 1 object of this class

    public static void getInstance(){
        Test test = new Test(101);
    }

}

class Main {
    public static void main(String[] args) {

       /* Test test1 = new Test(101);
        Test test2 = new Test(102);*/

    }
}
