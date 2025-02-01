package feb1;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        // TreeSet - natural sorting order
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        System.out.println(set);

       /* System.out.println(set.contains(18));
        System.out.println(set.last());
        System.out.println(set.first());
*/
        // Returns the greatest element in this set less than or
        // equal to the given element, or null if there is no such element.
        System.out.println(set.floor(1));

        // Returns the least element in this set greater than or equal to the given element,
        // or null if there is no such element.
        System.out.println(set.ceiling(15)); // 2313, highest or equal.



        //Returns the greatest element in this set strictly less than
        // the given element, or null if there is no such element.
        System.out.println(set.lower(10));


        /*System.out.println(set.pollFirst());
        System.out.println(set.pollLast());*/

        System.out.println(set);

        System.out.println(set.tailSet(30));
        System.out.println(set.headSet(30, true));
        System.out.println(set.headSet(10));


        // 10 20 30 40 50 60 ....

    }
}
