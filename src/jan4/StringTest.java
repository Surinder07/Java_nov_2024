package jan4;

public class StringTest {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Pragra");
       //  System.out.println(sb);

    //    System.out.println(sb);
        StringBuffer newString = sb.append(" Company");

        // System.out.println(newString);
        System.out.println(sb);

        // sb  ---------->    Pragra Company
        // sb.append

        StringBuilder strBuilder = new StringBuilder("Laptop");
        strBuilder.append(" Dell");
        System.out.println(strBuilder);


        System.out.println(strBuilder.reverse());

        //String vs StringBuilder vs StringBuffer - Interview question


    }
}
