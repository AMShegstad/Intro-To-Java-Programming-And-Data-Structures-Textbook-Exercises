
/*
 * (Financial Application: monetary units) Modify Listing 2.10, ComputeChange.java to display the
 * nonzero denominations only, using singularly words for single units such as 1 dollar and 1 penny,
 * and plural words for more than one unit such as 2 dollars and 3 pennies.
 *
 * Listing 2.10 ComputeChange.Java is as follows:
 * 
 * // Create a Scanner
 * Scanner input = new Scanner(System.in);
 * 
 * // Receive the amount
 * System.out.println("Enter an amount in double, for example 11.56: ");
 * double amount = input.nextDouble();
 * input.close();
 * 
 * int remainingAmount = (int)(amount * 100);
 * 
 * // Find the number of one dollars
 * int numberOfOneDollars = remainingAmount / 100;
 * remainingAmount = remainingAmount % 100;
 * 
 * // Find the number of quarters in the remaining amount
 * int numberOfQuarters = remainingAmount / 25;
 * remainingAmount = remainingAmount % 25;
 * 
 * // Find the number of dimes in the remaining amount
 * int numberOfDimes = remainingAmount / 10;
 * remainingAmount = remaniingAmount % 10;
 * 
 * // Find the number of nickely in the remaining amount
 * int numberOfNickels = remainingAmount / 5;
 * remainingAmount = remainingAmount % 5;
 * 
 * // Find the number of pennies in the remaining amount
 * int numberOfPennies = remainingAmount;
 * 
 * // Display results
 * System.out.println("Your amount " + amount + " consists of: ");
 * System.out.println(" " + numberOfOneDollars + " dollars ");
 * System.out.println(" " + numberOfQuarters + " quarters ");
 * System.out.println(" " + numberOfDimes + " dimes ");
 * System.out.println(" " + numberOfNickels + " nickels ");
 * System.out.println(" " + numberOfPennies + " pennies");
 */
import java.util.Scanner;

public class exercise_3_7 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        input.close();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickely in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Work with Strings for formatting response
        System.out.println("Your amount " + amount + " consists of: ");

        // Dollars
        if (numberOfOneDollars == 0) {
            System.out.print("");
        } else if (numberOfOneDollars == 1) {
            System.out.println(" " + numberOfOneDollars + " dollar ");
        } else {
            System.out.println(" " + numberOfOneDollars + " dollars ");
        }

        // Quarters
        if (numberOfQuarters == 0) {
            System.out.print("");
        } else if (numberOfQuarters == 1) {
            System.out.println(" " + numberOfQuarters + " quarter ");
        } else {
            System.out.println(" " + numberOfQuarters + " quarters ");
        }

        // Dimes
        if (numberOfDimes == 0) {
            System.out.print("");
        } else if (numberOfDimes == 1) {
            System.out.println(" " + numberOfDimes + " dime ");
        } else {
            System.out.println(" " + numberOfDimes + " dimes");
        }

        // Nickels
        if (numberOfNickels == 0) {
            System.out.print("");
        } else if (numberOfNickels == 1) {
            System.out.println(" " + numberOfNickels + " nickel ");
        } else {
            System.out.println(" " + numberOfNickels + " nickels ");
        }

        // Pennies
        if (numberOfPennies == 0) {
            System.out.print("");
        } else if (numberOfPennies == 1) {
            System.out.println(" " + numberOfPennies + " penny");
        } else {
            System.out.println(" " + numberOfPennies + " pennies ");
        }
        /*
         * // Display results
         * System.out.println("Your amount " + amount + " consists of: ");
         * System.out.println(" " + numberOfOneDollars + " dollars ");
         * System.out.println(" " + numberOfQuarters + " quarters ");
         * System.out.println(" " + numberOfDimes + " dimes ");
         * System.out.println(" " + numberOfNickels + " nickels ");
         * System.out.println(" " + numberOfPennies + " pennies");
         */
    }
}
