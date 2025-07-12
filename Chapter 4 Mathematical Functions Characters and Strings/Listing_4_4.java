/*
 * Listing 4.4, page 143
 * 
 * HexDigit2Dec.java
 */

import java.util.Scanner;

public class Listing_4_4 {
    
    public static void main(String[] args) {

        // Create a Scanner object.
        Scanner input = new Scanner(System.in);

        // Prompt the user to give a Hex Digit.
        System.out.print("Enter a Hex Digit: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character.
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character.");
            System.exit(1);
        }
        input.close();

        // Display decimal value for the hex digit.
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        } else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input...");
        }
    }
}
