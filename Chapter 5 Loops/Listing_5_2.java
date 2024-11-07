/*
Listing 5.2
GuessNumberOneTime.java
 */

import java.util.Scanner;

public class Listing_5_2 {

    public static void main(String[] args) {

        // Generate a random number to be guessed.
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number.
        System.out.println("\nEnter your guess: ");
        int guess = 101;

        while (guess != number) {

            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + guess + "!");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        }
    }
}
