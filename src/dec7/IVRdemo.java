package dec7;

import java.util.Scanner;

public class IVRdemo {
    public static void main(String[] args) {

        System.out.println("**********");
        System.out.println("Welcome to Rogers");
        System.out.println("**********");
        System.out.println("1. English");
        System.out.println("2. French");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice ");
        int choice = scanner.nextInt();


        if(choice == 1) {

            System.out.println("1. Billing");
            System.out.println("2. Sales");
            System.out.println("3. Technical Support");
            System.out.println("4. Complaint");
            System.out.println("5. Talk to Rep...");
            System.out.println();
            System.out.println("Enter the input");
            int input = scanner.nextInt();

            switch (input ) {

                case 1 :
                    System.out.println("Billing department...");
                    break;
            }



        }
        else if(choice == 2) {



        }
        else {
            System.err.println("Invalid choice.. ");
        }





    }
}
