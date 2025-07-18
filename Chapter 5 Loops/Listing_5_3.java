/*
Listing 5.3
GuessNumber.java
 */

import java.util.Scanner;
public class Listing_5_3 {

    public static void main(String[] args) {

        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int guess = -1;
        while (guess != number) {
            // Prompt the user to guess the number.
            System.out.println("Enter your guess:");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number + ".");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            } // End of loop
        }

        input.close();

    }
}
