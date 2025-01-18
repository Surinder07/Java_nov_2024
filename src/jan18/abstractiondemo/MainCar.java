package jan18.abstractiondemo;

public class MainCar {
    public static void main(String[] args) {

        Vehicle  car = new Car();

        car.accelerate();
        car.brake();


        Vehicle bike = new Bike();
        bike.brake();
    }
}


/*

Class Name : Animal,       - it is abstract class
methods  -  make all of these as abstract methods
eat, makeSound, sleep()

Dog                  Cat                Tiger

         Create a main class
         Create object of Dog class, Cat class and Tiger
         and call the methods..









 */






