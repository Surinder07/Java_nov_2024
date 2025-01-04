package jan4.ineritance;

public class Laptop extends Computer{
    @Override
    public void showDetails() {
        System.out.println(capacity);

    }
}


/*

method overrriding - same method name but diff implementaion

   Computer             --- Parent   showDetails()

   Laptop               -- Child    showDetails()


   Laptop ---- laptop.showDetails()

   Computer com = com.showDetails();




 */