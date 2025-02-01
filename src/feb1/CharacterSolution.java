package feb1;

import java.util.HashMap;
import java.util.Map;

public class CharacterSolution {
    public static void main(String[] args) {

        String s1 = "Pragra";
        char[] myChars = s1.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();

        for (char ch : myChars) {
            charMap.put(ch, charMap.getOrDefault(ch,0) + 1);
        }


        //map.put(charMap, charMap.getOrDefault(charMap,0) + 1);
    }
}
