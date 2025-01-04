package jan4;

public class StringDemo {
    public static void main(String[] args) {

        String s = "   PRAGRA   ";

        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(1));
        System.out.println(s.length());
        char[] chars = s.toCharArray();

        String concat = s.concat(" Company");
        System.out.println(concat);

        System.out.println(s.trim());

       // 10 - 15 mins.


    }
}
