package feb1;

import java.util.*;

public class MapProblems {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ontario", 25);
        map.put("NB", 13);
        map.put("BC", 18);
        map.put("Alberta", 34);
        map.put("Quebec", 12);
        map.put("Manitoba", 4);


        Collection<Integer> totalWalmarts = map.values();
        System.out.println(totalWalmarts);

        // compare , first two values and add that value to max


        // highest number of walmart

        Collection<Integer> listOfWalmart = map.values();
        System.out.println(listOfWalmart);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(listOfWalmart);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        //Map<Character, Integer> charMap = new HashMap<>();

       // map.put(charMap, charMap.getOrDefault(charMap,0) + 1);


    }
}
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





           1. Given a string

            Pragra  / Mississauga

            find the occurence of each character

            P - 1
            r - 2
            a - 2
            g - 1

            convert to char array
            loop over it
            store each character into map
            Map<Character, Integer> map = new HashMap<>();

            map.put('p', map.getOrDefault(0) + 1)


            HOME Assignment :
            String s = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?"













 */