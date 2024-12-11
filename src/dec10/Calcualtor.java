package dec10;

import java.util.function.Consumer;

public class Calcualtor {
    public static void main(String[] args) {

        // call this method sum

        Calcualtor calcualtor = new Calcualtor();
        calcualtor.sum();
        calcualtor.sum();
        calcualtor.sum();



    }

    public void sum() {
        int x = 10;
        int y = 20;
        int sum = x + y;

        System.out.println("Sum  " + sum);
    }
}


