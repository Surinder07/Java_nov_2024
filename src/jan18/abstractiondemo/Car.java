package jan18.abstractiondemo;

public class Car extends Vehicle{

    @Override
    public void brake() {
        System.out.println("Car brakes");
    }

    @Override
    public void start() {

    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");

    }
}
