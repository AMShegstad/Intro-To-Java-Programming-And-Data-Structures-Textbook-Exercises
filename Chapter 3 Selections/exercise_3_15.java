import java.util.Scanner;
import java.util.Random;

/*
* (Game: Lottery) Revise listing 3.8, Lottery.java, to generate a lottery of a
* three-digit integer. The program prompts the user to enter a three-digit integer
* and determines whether the user wins according to the following rules:
* 
* 1. If the user input matches the lottery number in the exact order, the award is $10,000.
* 
* 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
*
* 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
* 
* 
* Listing 3.8 is as follows:
* 
* import java.util.Scanner;

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
*/

public class exercise_3_15 {

    public static void main(String[] args) {

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (Three Digits) : ");
        int guess = input.nextInt();
        input.close();
        String guessString = String.valueOf(guess);

        Random rand = new Random();

        // Get digits from lottery
        // int lotteryDigit1 = lottery / 10;
        // int lotteryDigit2 = lottery % 10;
        int lotteryDigit1 = rand.nextInt(10);
        int lotteryDigit2 = rand.nextInt(10);
        int lotteryDigit3 = rand.nextInt(10);

        String lottoString = String.valueOf(lotteryDigit1) + String.valueOf(lotteryDigit2)
                + String.valueOf(lotteryDigit3);

        // Get digits from guess
        int guessDigit1 = (guess / 10) + 1;
        int guessDigit2 = (guess % 10);
        int guessDigit3 = guessDigit2 % 10 + 1;

        System.out.println("The lottery number is " + lottoString);

        // Check the guess
        if (guessString == lottoString) {

            System.out.println("Exact Match! You Win $10,000!");

        } else if (
            (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit3) ||
            (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) ||
            (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3) ||
            (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1) ||
            (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2) ||
            (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1) ) { 

            System.out.println("Matched All Digits! You Win $3,000!");

        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) { 
            System.out.println("Matched One Digit! You Win $1,000!");
        } else {
            System.out.println("Sorry, No Match.");
        }
    }
}
