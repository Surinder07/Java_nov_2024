package dec17;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // datatype[] ref = new datatype[SIZE];
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter the elements of array ");

        // taking user input for array
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        // printing out the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        // index based

       /* int rollNo = 101;
        int rollNo2 = 102;
        int rollNo3 = 103;
        int rollNo4 = 104;
        int rollNo5 = 105;
        int rollNo6 = 106;
        int rollNo7 = 107;
        //  100 roll nos... 1M

        String name1 = "Mike";
        String name2 = "Peter";  //

*/

        // Array  - similar type of data / Homogenous
        // contigous memory location ..

    }
}
