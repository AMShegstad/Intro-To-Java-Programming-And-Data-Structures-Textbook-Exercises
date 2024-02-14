
/*
 * Lottery.java
 */
import java.util.Scanner;

public class Listing_3_8 {

    public static void main(String[] args) {

        // Generate a lottery number
        int lottery = (int) (Math.random() * 100) + 1;

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (Two Digits) : ");
        int guess = input.nextInt();
        input.close();

        // Get digits from lottery
        // int lotteryDigit1 = lottery / 10;
        // int lotteryDigit2 = lottery % 10;
        int lotteryDigit1 = (lottery / 10) + 1;
        int lotteryDigit2 = (lottery % 10) + 1;

        // Get digits from guess
        int guessDigit1 = (guess / 10) + 1;
        int guessDigit2 = (guess % 10);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact Match! You Win $10,000!");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Matched All Digits! You Win $3,000!");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Matched One Digit! You Win $1,000!");
        } else {
            System.out.println("Sorry, No Match.");
        }

        /*
         * One issue that I will need to look at later on is the possibility of getting
         * a zero. One solution is to add one to the equation with which I determine
         * the numbers.
         */
    }
}
