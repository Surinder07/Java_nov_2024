package jan25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

     //    aaaabbbccc
        // a4b3c3


        int[] arr = new int[5];
        arr[0] = 10;
       // arr[1] = "Hello";

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(0);
        list.add(50);
        list.add(60);

        List<String> list1 = new ArrayList<>();
        list1.add("Pragra");

        List<Integer> list2 = new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(30);
        list2.add(0);
        list2.add(50);
        list2.add(60);
        // list.sort(null); Comparator vs Comparable

        // add list to list2

        int size = list.size();
        System.out.println("size of the arraylist : "+size);

        System.out.println(list.get(5));
        list.set(0, 1000);

        Object[] objects = list.toArray(); // this convers list to array

        System.out.println(list.remove(0));

        System.out.println(list);
        boolean remove = list.remove(new Integer(20));
         // list.remove(Integer.valueOf(10));

        System.out.println(remove);

        System.out.println(list);


    }
}

