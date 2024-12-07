package dec3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("*************************");
        System.out.println("Welcome to My Calculator");
        System.out.println("*************************");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Div");
        System.out.println("5. Modulus");
        System.out.println("0. EXIT");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice : ");
        int input = scanner.nextInt();

        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();

        switch (input) {
            case 1 :
                System.out.println(num1 + num2);
                System.out.println("Do you still want to continue, Press y for yes , N for NO " );

                break;
            case 2 :
                break;
            case 3 :
                break;


            case 0:
                System.out.println("Exit ");
                System.exit(0);

            default:
                System.out.println("exit ");
        }

        // take user input for choice .

        // perform, addition , subtraction , multiplication , div


        // take input for num1 num2

    }
}
