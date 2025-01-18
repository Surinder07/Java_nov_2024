package jan18.interf;

public class Laptop implements Computer{
    @Override
    public void calculate() {
        System.out.println("Calculating...");
    }

    @Override
    public void start() {

    }

    @Override
    public void surfInternet() {

        System.out.println("Surfing youtube");
    }

    @Override
    public void calling() {

    }
}
