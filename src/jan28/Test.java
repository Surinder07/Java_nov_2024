package jan28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {

         List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(10);
         list.add(30);
         list.add(40);
         list.add(null);
         list.add(null);

         // Traverse ?
        // for loop
        // size of the list ? list.size()
        // how to get the element in the list , list.get(i)

        for (int i = 0; i < list.size() ; i++) {
            // System.out.print(list.get(i)+ ",");
        }

//      For each
        for (Integer e : list) {
            System.out.println(e);
        }




    }
}
