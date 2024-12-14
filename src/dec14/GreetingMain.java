package dec14;

import java.util.Scanner;

public class GreetingMain {
    public static void main(String[] args) {

        GreetingDemo gm = new GreetingDemo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String userEnteredName = scanner.nextLine();

        String nat = gm.greeting(userEnteredName);

        System.out.println(nat);
    }
}
