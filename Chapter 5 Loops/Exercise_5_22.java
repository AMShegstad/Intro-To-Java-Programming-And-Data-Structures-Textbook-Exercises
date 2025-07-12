/*
 * (Financial Application: Loan Amortization Schedule)
 * 
 * The monthly payment for a given loan pays the principle and interest. The monthly interest is computed by multipliying the monthly
 * interest rate and the balance (the remaining principle). The principal paid for the month is therefore the monthly payment minus
 * the monthly interest. Write a program that lets the user enter the loan amount, number of years, and interest rate then displays
 * the amortization schedule for the loan. Here is a sample run:
 * 
 * Loan Amount: 10000
 * Number of Years: 1
 * Annual Interest Rate: 7
 * 
 * Monthly Payment: 865.26
 * Total Payment: 10383.21
 * 
 * Payment#    Interest     Pincipal     Balance
 * 1           58.33        806.93       9193.07
 * 2           53.62        811.64       8381.42
 * ...
 * 11          10.00        855.26       860.27
 * 12          5.01         860.25       0.01
 */

import java.util.Scanner;

public class Exercise_5_22 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loan amount: \n");
        double loanAmount = input.nextDouble();
        System.out.println("Enter the number of years: \n");
        double years = input.nextDouble();
        System.out.println("Enter the interest rate of the loan: \n");
        double interestRate = input.nextDouble();

        input.close();

        displayAmortizationSchedule(loanAmount, years, interestRate);
    }

    public static void displayAmortizationSchedule(double loanAmount, double loanLength, double interestRate) {

        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Number of Years: " + loanLength);
        System.out.println("Annual Interest Rate: " + interestRate + "%");

        double monthlyRate = (interestRate / 100) / 12;
        int numberOfPayments = (int) (loanLength * 12);

        double monthlyPayment = loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment);

        double balance = loanAmount;

        System.out.println("Payment#    Interest     Principal     Balance");
        System.out.println("--------    --------     ---------     -------");

        for (int paymentNumber = 1; paymentNumber <= numberOfPayments; paymentNumber++) {
            double interestPayment = monthlyRate * balance;
            double principalPayment = monthlyPayment - interestPayment;
            balance -= principalPayment;
            
            // Ensure balance doesn't go negative due to floating point precision
            if (balance < 0.01) balance = 0;

            System.out.printf("%-8d    $%-8.2f    $%-9.2f    $%.2f%n", 
                             paymentNumber, interestPayment, principalPayment, balance);
        }
    }
}
