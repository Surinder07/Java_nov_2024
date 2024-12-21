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


    }
}
