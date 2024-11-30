package nov30.userinput;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for x ");
        int x = s.nextInt();

        System.out.println("Enter the value for y");
        int y = s.nextInt();

        int sum = x + y;
        System.out.println("Sum of x and y is :"+ sum);


    }
}

/*


primitive       - int , float, char, double , boolean
non primitive   - Class,  Array , String
 */