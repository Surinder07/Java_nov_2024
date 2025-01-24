package jan23;

import java.util.Scanner;

class Test{
    public static void main(String[] args) {

        String name = "Pragra";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(name.toUpperCase()); // code works fine
            System.exit(0);
            int x = 10/0;
            System.out.println(x);

            // xyz exception

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("In the finally block ");
            scanner.close();
        }

        System.out.println(":hello");
    }
}

// super class for all exception classes ?
/*
 Throwable
    |
 Exception
    |
 RuntimeException
    |
 NullPointerException

Amazon                          Stripe/ Payments
App1
employee                        App 2
id
name
salary                  ---->   uses salary filed to calculate total salary given to employess
                                median salary
                                - NullPointerException



 */
