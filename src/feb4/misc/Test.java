package feb4.misc;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // Arrays

        int[] arr1 = {10,2340,230,12,45,12,23,534};
        int[] arr2 = {10,2340,230,12,45,12,23,534};

       /* Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1, 11));*/

        System.out.println("Array 1 : "+Arrays.toString(arr1));
        System.out.println("Array 2 : "+Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr1, arr2));


        // Simple method to create a list of Integers
        List<Integer> list = Arrays.asList(10, 20, 2340, 40, 50, 50, null, null);
       // list.add(100);
        System.out.println(list);


        // Java 9
        List<Integer> list1 = List.of(10, 0, 234, 23, 23);
        list1.add(1000);



        // binary search -   Dictionary        Hello
        //    H K right side

        // [10, 12, 12, 23, 45,

        // 230 > 12
        //  10 < 12


    }
}
