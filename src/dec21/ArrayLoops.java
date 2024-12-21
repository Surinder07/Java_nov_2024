package dec21;

import java.util.Scanner;

public class ArrayLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the elements of an array ");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("");
        // enhanced for loop
        // for every integer element in the array , print that element
        for ( int e : arr ) {
            System.out.println(e);
        }

        // create an array from 1-10
        // create an array of Fruits
        // create an array for list of countries in North America

        /*
        100 120     300 40 50 160 370 180 190  ----> 370

        comparing numbers

        int max = 0;

        1. create array  :  100 120     300 40 50 160 370 180 190
        2. take a variable max = 0
        3. compare the numbers with max and assign it to max
        4. if you find max is smaller than the number , update the max value.




         */

    }
}
