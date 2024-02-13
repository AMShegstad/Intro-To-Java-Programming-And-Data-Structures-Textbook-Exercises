
/*
 * (Financial Application: calculate interest) If you know the balance and the annual percentage interest rate,
 * you can computer the interest on the next monthly payment useing the following formula:
 * 
 * interest = balance x (annualInterestRate/1200)
 * 
 * Write a program that reads the balance and the annual percentage interest rate and displays the interest 
 * for the next month. 
 */
import java.util.Scanner;

public class exercise_2_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account balance: ");
        double balance = input.nextDouble();

        System.out.println("Enter the interest rate: ");
        double rate = input.nextDouble();

        double interest = balance * (rate / 1200);

        System.out.println("You interest for the next month will be " + interest);
        input.close();
    }
}
