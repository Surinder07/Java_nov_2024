package dec7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char input1 = scanner.next().charAt(0);
        do {
            System.out.println("*************************");
            System.out.println("Welcome to My Calculator");
            System.out.println("*************************");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Div");
            System.out.println("5. Modulus");
            System.out.println("0. EXIT");


            System.out.println("Enter your choice ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    char input;
                    do {
                        System.out.println("Enter the first Number");
                        int num1 = scanner.nextInt();


                        System.out.println("Enter the second Number");
                        int num2 = scanner.nextInt();

                        int sum = num1 + num2;

                        System.out.println("Sum of num1 and num2 " + sum);

                        System.out.println("Do you still want to add more numbers ");
                        System.out.println("Press Y for yes, N for No");
                        input = scanner.next().charAt(0);

                    } while (input == 'Y' || input == 'y');

                    break;
                case 2:
                    break;

                case 3:
                    break;
                default:
                    System.out.println("exit ");
            }
            System.out.println("Do you want to go back to main menu..");

        } while(input1=='n'||input1=='N');


    }
}
