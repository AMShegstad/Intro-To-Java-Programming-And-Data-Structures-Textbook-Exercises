/*
 * Listing 4.5, Page 145.
 * 
 * LotteryUsingStrings.java
 */
import java.util.Scanner;

public class Listing_4_5 {
    
    public static void main(String[] args) {

        // Generate a Lottery number as a two-digit String.
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        // Prompt the user to enter a guess.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();
        input.close();

        // Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)) {
            System.out.println("Exact Match! You win $10,000!");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Matched All Digits! You win $3,000!");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Matched One Digit! You win $1,000.");
        } else {
            System.out.println("Sorry, no match...");
        }
    }
}
