/*
 * Listing 5.9
 * GreatestCommonDivisor.Java
 * 
 * This program prompts the user to enter two positive integers and finds their gretest common divisor.
 */

 import java.util.Scanner;

public class Listing_5_9 {
   
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();
        input.close();

        int gcd = 1; // Initial gcd is 1.
        int k = 2; // Possible gcd.

        for (k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; // Update gcd
            }
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
