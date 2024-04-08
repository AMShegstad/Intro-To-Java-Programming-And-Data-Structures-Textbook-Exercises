
/*
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is a 
 * Palindrome if it reads the same from right to left and from left to right. A 
 * negative integer is treated the same as a positive integer.
 */
import java.util.Scanner;

public class exercise_3_12 {

    public static void main(String[] args) {

        // Prompt user to enter an integer.

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a three-digit number:\n");
        int number = input.nextInt();
        input.close();

        String numAsString = String.valueOf(number);

        if (numAsString.charAt(0) == numAsString.charAt(2)) {
            System.out.println("Yes, the number is a palindrome!");
        } else {
            System.out.println("Sorry, the number is not a palindrome.");
        }

    }
}
