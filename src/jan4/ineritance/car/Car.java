package jan4.ineritance.car;

public class Car extends Vehicle{
    int numberOfDoors;

    @Override
    public void start() {
        System.out.println("Car starts ");
    }

    @Override
    public void brake() {
        System.out.println("Car brakes...");
    }


    public boolean hasAC(){
        return true;
    }



}
