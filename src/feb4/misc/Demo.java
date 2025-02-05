package feb4.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 30, 50, 60, 30, 90);


       /* Collections.reverse(list);

        Collections.shuffle(list);

        // min and max
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
*/
        System.out.println("Frequencey of 30 is : "+Collections.frequency(list, 30));

        Collections.swap(list, 0, 1);

        // you can not modify this list
        List<Integer> list1 = Collections.unmodifiableList(list);

        // this empty list
        List<Object> objects = Collections.emptyList();

        System.out.println(objects);

        // this is thread safe list
        List<Integer> list2 = Collections.synchronizedList(list);


        System.out.println(list);

    }
}
