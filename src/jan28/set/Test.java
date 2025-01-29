package jan28.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);

        System.out.println(set);
       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(30);
       list.add(40);
       list.add(50);
       list.add(50);
        // remove the duplicate numbers from the list.




    }
}
