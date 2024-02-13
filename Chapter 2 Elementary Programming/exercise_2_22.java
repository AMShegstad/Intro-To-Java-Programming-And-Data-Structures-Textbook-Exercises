
/*
 * (Financial Application: monetary units) Rewrite listing 2.1 ComputChange.java, to 
 * fix the possible loss of accuracy when converting a double value to an int value.
 * Enter the input as an interger whose last two digits represent the cents. 
 * 
 * for example, the input of 1156 represents 11 dollars and 56 cents. 
 * 
 * Listing 2.10 from the text follows below:
 * 
 * import java.util.Scanner
 * 
 * public class ComputeChange {
 *      public static void main(String[] args) {
 *      
 *      //Create a Scanner
 *      Scanner input = new Scanner(System.in);
 * 
 *      // Recieve the amount
 *      System.out.println(" Enter an amount in double, for example 11.56: ");
 *      double amount = input.nextDouble();
 * 
 *      int remainingAmount = (int)(amount * 100);
 *      
 *      // Find the number of one dollars
 *      int numberOfOneDollars = remainingAmount / 100;
 *      remainingAmount = remainingAmount % 100
 * 
 *      // Find the number of quarters
 *      int numberOfQuarters = remainingAmount / 25;
 *      remaininngAmount = remainingAmount % 25;
 * 
 *      // find the number of dimes
 *      int numberOfDimes = remainingAmount / 10;
 *      remainingAmount = remainingAmount % 10;
 * 
 *      // Find then number of nickels
 *      int numberOfNickels = remainingAmount / 5;
 *      remainingAmount = remainingAmount % 5;
 * 
 *      // Find the number of pennies
 *      int numberOfPennies = remainingAmount
 * 
 *      //Display Results
 *      System.out.println("Your amount of " + amount + " consists of ");
 *      System.out.println(" " + numberOfDollars + " dollars, ");
 *      System.out.println(" " + numberOfQuarters + " quarters, ");
 *      System.out.println(" " + numberOfDimes + " dimes, ");
 *      System.out.println(" " + numberOfNickels + " nickels, ");
 *      System.out.println(" and " + numberOfPennies + " pennies.");
 *      }
 * }
 */
import java.util.Scanner;

public class exercise_2_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value, excluding the decimal: ");
        int intValue = input.nextInt();
        input.close();

        double trueValue = (double) (intValue / 100);
        System.out.println(trueValue);

        int remainingAmount = intValue;

        // Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // find the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find then number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies
        int numberOfPennies = remainingAmount;

        // Display Results
        System.out.println("Your amount of " + intValue + " consists of ");
        System.out.println(" " + numberOfDollars + " dollars, ");
        System.out.println(" " + numberOfQuarters + " quarters, ");
        System.out.println(" " + numberOfDimes + " dimes, ");
        System.out.println(" " + numberOfNickels + " nickels, ");
        System.out.println(" and " + numberOfPennies + " pennies.");
    }
}
