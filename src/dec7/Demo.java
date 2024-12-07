package dec7;

public class Demo {
    public static void main(String[] args) {
        int x = 0;

        if(x < 10) {
            System.out.println("X is less than 10 ");
        }else {
            System.out.println("X is greater than 10 ");
        }


        String output = (x <10) ? "X is less than 10" : "X is greater than 10 ";
        System.out.println(output);
        System.out.println();

        int result = ((x%2 ==0))   ?   1   :    0;
        System.out.println(result);


        for (int i = 0; i < 100 ; i++) {
            if(i % 5 == 0){
               continue;
            }
            System.out.println(i);
        }

        // ternary operator

        /*
        break;    - break out of the loop
        continue;  - skip the iteration


        1. print number from 1 - 100
        skip the multiple of 5
        1 2 3 4 Pragra
        6 7 8 9 Pragra
        11 12 13 14 Pragra




         */

    }
}
