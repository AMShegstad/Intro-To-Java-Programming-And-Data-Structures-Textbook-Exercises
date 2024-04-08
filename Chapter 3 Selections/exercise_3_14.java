/*
 * (Game: heads or tails) Write a program that lets the user guess whether the
 * flip of a coin results in heads or tails. The proram randomly generates an
 * integer of 0 or 1, which represent head or tail. The program prompts the user
 * to enter a guess, and reports whether the guess is correct or incorrect.
 */

import java.util.Scanner;
import java.util.Random;

public class exercise_3_14 {

    public static void main(String[] args) {
        // Greet the user
        System.out.println("************ Welcome to Heads or Tails! *************\n");

        // Flip the coin before the user's guess.
        Random rand = new Random();
        int flip = rand.nextInt(2);
        String side;

        // Get user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for 'Heads' or 0 for 'Tails'.");
        int guess = input.nextInt();

        if (flip == 1) {
            side = "Heads";
        } else {
            side = "Tails";
        }

        if (guess == flip) {
            System.out.println("You guessed correctly! It was " + side + "!");
        } else {
            System.out.println("You guessed incorrectly. It was " + side + "...");
        }
    }
}
