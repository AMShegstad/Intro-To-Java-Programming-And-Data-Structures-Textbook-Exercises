/*
 * TestBooleanOperators.java
 */

import java.util.Scanner;

public class Listing_3_6 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        input.close();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 2 and 3.");
        }

        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3");
        }

        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible either 2 or 3, but not both.");
        }
    }
}
