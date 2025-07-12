/*
 * (Financial Application: compare loans with various interest rates)
 * 
 * Write a program that let's the user enter the loan amount and loan period in number of years,
 * and displays the monthly and total payments for each interest rate starting from 5% to 8%, 
 * with an increment of 1/8 (0.125);
 */
import java.util.Scanner;

public class Exercise_5_21 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the loan amount: \n");
        double amount = input.nextDouble();
        System.out.println("How long is the loan for? \n");
        int length = input.nextInt();
        input.close();

        displayLoanData(amount, length);
    }

    public static void displayLoanData(double loanAmount, int years) {
        
        double startRate = 5.0;
        double endRate = 8.0;
        double increment = 0.125;

        System.out.println("Interest Rate  Monthly Payment  Total Payment     ");
        System.out.println("-------------     ---------------    -------------");
        
        for (double annualRate = startRate; annualRate <= endRate; annualRate += increment) {
            // Convert annual rate to monthly rate (as decimal)
            double monthlyRate = (annualRate / 100) / 12;
            
            // Total number of payments
            int numberOfPayments = years * 12;
            
            // Calculate monthly payment using the formula
            double monthlyPayment = loanAmount * 
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / 
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
            
            // Calculate total payment
            double totalPayment = monthlyPayment * numberOfPayments;
            
            // Display results with proper formatting
            System.out.printf("%.3f%%         $%.2f           $%.2f%n", 
                             annualRate, monthlyPayment, totalPayment);
        }
    }
}
