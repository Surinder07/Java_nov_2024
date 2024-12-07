package dec7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int x = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range you want to print ");
        int n = scanner.nextInt();

        int sum =0;

        while(x <= n ){
           // sum = sum + x;

            sum+=x;
            //System.out.println(x);

            System.out.println(x);
            x++;
        }

        System.out.println("sum of first "+ n +  " numbers is  " +sum);

        /*
            5 * 1 = 5
            5 * 2 = 10
            5 * 3 = 15
            5 * 4 = 20
            5 * 5 = 25
            5 * 6 = 30
            5 * 7 = 35
            5 * 8 = 40
            5 * 9 = 45
            5 * 10 = 50

          1.   print number from 1- 10

          2.    Enter the value of n = 100
            print numbers from 1- n ,

          3. Sum of 1- 10

          or 1- n




         */

    }
}
