package dec3;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Object of Scanner class
        // int x = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = scanner.nextLine();

        System.out.println(name);

        System.out.println("Enter the number");
        int x = scanner.nextInt();
        System.out.println(x);

       // char ch = scanner.next().charAt(0);
        char next = scanner.next().charAt(0);
        // Hello -----> H
        //


        // arrays in java - which starts at 0 index

       /* System.out.println("Enter the first Name ");
        String firstName = scanner.next();

        System.out.println("Enter the last Name ");
        String lastName = scanner.next();


        System.out.println("Print the name " + firstName +" " + lastName);*/










    }
}
