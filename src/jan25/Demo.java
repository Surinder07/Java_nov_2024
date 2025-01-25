package jan25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);


        List<String> list2 = new LinkedList<>();
        list2.add("BMW");
        list2.add("Toyota");
        list2.add("Audi");

        System.out.println(list1);
        System.out.println(list2);

       // list2.add(list1);



    }
}
