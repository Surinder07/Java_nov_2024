package dec4;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Create a List to hold Map objects
        List<Map<String, Integer>> listOfMaps = new ArrayList<>();

        // Create the first Map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 10);
        map1.put("Banana", 20);

        // Create the second Map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Orange", 15);
        map2.put("Grapes", 25);

        // Add the Maps to the List
        listOfMaps.add(map1);
        listOfMaps.add(map2);

        // Print the List of Maps
        for (Map<String, Integer> map : listOfMaps) {
            System.out.println(map);
        }
    }
}

