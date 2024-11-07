/*
 * Listing 5.14
 * Palindrome.java
 * 
 * A String is a palindrome is it reads the same forwards and backward. The words 'mom', 'dad', and 'noon', for instance,
 * are all palindromes. The problem is to write a program that prompts the user to enter a String and reports whether the String
 * is a palindrome. One solution is to check whether the first character in the string is the same as the last character. If so,
 * check whether the second character is the same as the second-to-last character. This process continues until a mismatch is
 * found or all the characters in the string are checked, expect for the middle character is the string has an odd number of
 * characters.
 */
import java.util.Scanner;

public class Listing_5_14 {
    
    public static void main(String[] args) {

        // Create the Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a String
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        // The index of the first character of the String.
        int low = 0;

        // The index of  the last character of the String.
        int high = s.length() - 1;

        // Let's do the work!
        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }

            // Pull both numbers towards to middle of the word.
            low++; // Post Increment
            high--; // Post Decrement
        }

        if (isPalindrome) {
            System.out.println(s + " is a palindrome!");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
