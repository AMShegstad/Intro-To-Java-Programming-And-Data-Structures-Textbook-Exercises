/*
 * Listing 5.11
 * Dec2Hex.java
 * 
 * Listing 5.11 gives a program that prompts the user to enter a decimal number and converts
 * it into a hex number as a String.
 */

 import java.util.Scanner;

public class Listing_5_11 {
    
    public static void main(String[] args) {

        // Create a Scanner object.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal integer.
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        input.close();
        // Convert decimal into hex
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            // Convert decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9)?(char)(hexValue + '0'): (char)(hexValue - 10 + 'A');
            
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }

        System.out.println("The hex number is " + hex);
    }
}
