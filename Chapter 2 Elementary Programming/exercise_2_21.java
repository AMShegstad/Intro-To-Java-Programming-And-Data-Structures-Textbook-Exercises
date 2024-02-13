
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

        System.out.println("Enter the number of years: ");
        double years = input.nextDouble();

        /*
        *
        */
    }
}
