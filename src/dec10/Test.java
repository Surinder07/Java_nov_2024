package dec10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Object
        // ClassName ref = new ClassName();
       // Scanner scanner = new Scanner(System.in);

        Test test = new Test();
        test.sum(); // calling the method

        int multi = test.multi();

        if(multi > 10) {
            System.out.println("Something.... ");
        }

    }

    public void sum(){
         int a = 10;
         int b = 20;
         int sum = a + b;
        System.out.println(sum);
    }

    public int multi(){
        int a = 10;
        int b = 20;
        int multi = a * b;
        System.out.println(multi);
        return multi;
    }
}
