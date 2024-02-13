/*
 * ComputeTax.java
 */

import java.util.Scanner;

public class Listing_3_5 {

    public static void main(String[] args) {

        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.println(
                "Enter Filing Status - \n 0 - Single Filer \n 1 - Married Filing Jointly or Qualifying Widow(er) \n 2 - Married Filing Separately \n 3 - Head of Household");

        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.println("Enter the taxable income:");
        double income = input.nextDouble();

        input.close();

        // Compute tax
        double tax = 0;

        if (status == 0) {// Compute tax for single filers
            if (income < 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (income - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 1) { // Left as an exercise
            // Compute tax for married filing jointly ot qualifying widow(er)
        } else if (status == 2) { // Compute tax for married filing separately
            // Exercise 3.13
        } else if (status == 3) { // Computer tax for Head of Household
            // Exercise 3.13
        } else {
            System.out.println("Error: Invalid Status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
