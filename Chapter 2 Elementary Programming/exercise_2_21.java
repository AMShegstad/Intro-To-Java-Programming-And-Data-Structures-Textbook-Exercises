
/*
 * (Financial Application: calculate future investment value) Write a program that reads in investment amount,
 * annual interest rate, and number of years and displays the future investment value using the following
 * formula:
 * 
 * futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate)^numberOfYears*12
 * 
 * For example, is you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future 
 * investment value is 1032.98
 */
import java.util.Scanner;

public class exercise_2_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        // double monthlyInterestRate = annualInterestRate / 12;
        double trueInterestRate = annualInterestRate / 100;

        System.out.println("Enter the number of years: ");
        double years = input.nextDouble();

        /*
         * I did some research and found differing formulas on how to calculate this
         * data. I also had to change the percentage from a % to a decimal form, which
         * is the reason for the trueInterestRate variable. That solved my problems.
         */

        // double futureInvestmentValue = investmentAmount * (Math.pow((1 +
        // monthlyInterestRate), years * 12));

        double futureInvestmentValue = investmentAmount * (1 + (trueInterestRate * years));

        System.out.println("You future investment value is: " + futureInvestmentValue);
    }
}
