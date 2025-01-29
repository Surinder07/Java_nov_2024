package jan28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
       // System.out.println(list);
        /*
        /*
List of Fruits :
1. Traverse using for loop
2. For each loop
3. Iterator and list Iterators

 */
        // Iterator
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            //System.out.println(itr.next());
        }

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+ " ");
        }
    }
}


