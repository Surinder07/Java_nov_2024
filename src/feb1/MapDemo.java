package feb1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("Sahil", 90);   // Entry
        map.put("Aradhna", 88);
        map.put("Jay", 79);
        map.put("Rachna", 99);
        map.put("Mihir", 66);
        map.put("Sahil", 88);



        map.putIfAbsent("Kaviya", 100);
        map.putIfAbsent("Sahil", 78);


        System.out.println(map.get("Sahil"));

        Set<String> names = map.keySet();

        Collection<Integer> marks = map.values();
        System.out.println("Marks : "+marks);
        System.out.println(names);

        System.out.println(map);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        System.out.println("Entry set : "+entrySet);

        /*
           List of Provinces with Walamart
           Ontario - 25
           New Brunswick - 13
           BC - 18
           Alberta - 34
           Quebec - 12
           Manitoba - 4

           1. find the province with highest/lowest number of walmart stores
           2. list of the provinces
           3. give me total number of walmart present
           4. find the average of number of walmart present in country
           5. sort in ascending order







         */



        // Name : Sahil    - Entry

    }
}
