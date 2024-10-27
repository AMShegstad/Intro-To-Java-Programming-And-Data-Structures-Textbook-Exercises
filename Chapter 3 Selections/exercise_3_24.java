/*
 * (Game: Pick A Card) Write a Program that simulates picking a card from a deck of
 * 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. 
 */

import java.util.Random;

public class exercise_3_24 {

    public static void main(String[] args) {

        // Create the Random() object.
    Random rand = new Random();

    // Create an object to represent the rank, and another for the suite.
    int rankNumber = rand.nextInt(13) + 1;
    int suiteNumber = rand.nextInt(4) + 1;

    // Create Strings for displaying text.
    String rank = "";
    String suite = "";

    // Switch statement for the rank.
    switch(rankNumber) {
        case 1:
            rank = "Ace";
            break;
        case 2: 
            rank = "2";
            break;
        case 3:
            rank = "3";
            break;
        case 4:
            rank = "4";
            break;
        case 5:
            rank = "5";
            break;
        case 6:
            rank = "6";
            break;
        case 7:
            rank = "7";
            break;
        case 8:
            rank = "8";
            break;
        case 9:
            rank = "9";
            break;
        case 10:
            rank = "10";
            break;
        case 11:
            rank = "Jack";
            break;
        case 12:
            rank = "Queen";
            break;
        case 13:
            rank = "King";
            break;
        default:
    }

    // Switch statement for the suite
    switch (suiteNumber) {
        case 1:
            suite = "Clubs";
            break;
        case 2:
            suite = "Diamonds";
            break;
        case 3:
            suite = "Hearts";
            break;
        case 4:
            suite = "Spades";
            break;
    }

    System.out.println("The card you picked is the " + rank + " of " + suite + "."); 
}

}

    