package dec3;

import java.util.Scanner;


public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input....");
        String input = scanner.next();

        switch (input){
            case "Sum":
                System.out.println("Case 1");
            break;

            case "Subtraction" :
                System.out.println("Case 2");
            break;

            case "Multiplication":
                System.out.println("Case 3");
            break;

            default:
                System.out.println("Wrong input");
        }

    }
}
