package nov30.comparisonop;

public class Test1 {
    public static void main(String[] args) {

        // Logical op

        int x = 10;
        int y = 20;
                        // false      &&        true                -- false
       boolean result =  (x > y)     &&       (x != 0);         //     --  true

        System.out.println(result);

        /*
        AND

        true        false           --->   false
        false       true           --->     false
        false       false           --->   false
        true        true            --->   true


         OR
         true    flase      ----->   true
         true    true      ----->   true
         true    true      ----->   true
         false    flase      -----> false

        !
        false   -- true
        true    -- false



        x = x +y;
        x += y;





         */


    }
}
