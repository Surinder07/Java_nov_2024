package jan21;


class Laptop {

    // static Inner class
    static class HardDrive {
        int capacity = 100;

        public void store(){
            System.out.println("Drive storage cap is  : " + capacity);

            //local inner class
            class MyClass {

            }
        }
    }
}

public class StaticInnerDemo {
    public static void main(String[] args) {
        Laptop.HardDrive obj = new Laptop.HardDrive();
        obj.store();
    }
}
