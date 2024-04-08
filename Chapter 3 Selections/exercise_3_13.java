/*
 * (Financial Application: compute taxes) Listing 3.5, ComputeTax.java, gives the source code
 * to compute taxes for single filers. Complete this program to compute taxes for all filing
 * statuses.
 * 
 * According to the table 3.2 : 2009 U.S. Federal Personal Tax Rates
 *  10% Marginal Tax Rate:
 *      Single = $0 - $8350
 *      Married Filing Jointly or Qualifying Widow(er) = $0 - $16700
 *      Married Filing Separately = $0 - $8350
 *      Head of Household = $0 - $11950
 * 
 *  15% Marginal Tax Rate:
 *      Single = $8351 - $33950
 *      Married Filing Jointly or Qualifying Widow(er) = $16701 - $67900
 *      Married Filing Separately = $8351 - $33950
 *      Head of Household = $11951 - %45500
 * 
 *  25% Marginal Tax Rate:
 *      Single = $33951 - $82250
 *      Married Filing Jointly or Qualifying Widow(er) = $67901 - $137050
 *      Married Filing Separately = $33951 - $68525
 *      Head of Household = $45501 - $117450
 * 
 *  28% Marginal Tax Rate:
 *      Single = $82251 - $171550
 *      Married Filing Jointly or Qualifying Widow(er) = $137051 - $208850
 *      Married Filing Separately = $68526 - $104425
 *      Head of Household = $117451 - $190200
 *  
 *  33% Marginal Tax Rate:
 *      Single = $171551 - $372950
 *      Married Filing Jointly or Qualifying Widow(er) = $208851 - $372950
 *      Married Filing Separately = $104426 - $186475
 *      Head of Household = $190201 - $372950
 * 
 *  35% Marginal Tax Rate:
 *      Single = $372951+
 *      Married Filing Jointly or Qualifying Widow(er) = $372951+
 *      Married Filing Separately = $186476
 *      Head of Household = $372951
 * 
 * Listing 3.5: 
 * 
 *     public static void main(String[] args) {

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


    
 */

import java.util.Scanner;

public class exercise_3_13 {

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

        if (status == 0) {
            // Compute tax for single filers
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
            if (income < 16700) {
                tax = income * 0.10;
            } else if (income <= 67900) {
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            } else if (income <= 137050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            } else if (income <= 208850) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
            } else if (income <= 372950) {
                tax = 16700 * 0.10 + (67000 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                        + (income - 208850) * 0.33;
            } else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                        + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 2) {
            // Compute tax for married filing separately
            if (income < 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            } else if (income <= 186475) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                        + (income - 104425) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                        + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
            }
        } else if (status == 3) {
            // Computer tax for Head of Household
            if (income < 11950) {
                tax = income * 0.10;
            } else if (income <= 45500) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            } else if (income <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
            } else if (income <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
            } else if (income <= 372950) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                        + (income - 190200) * 0.33;
            } else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                        + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
            }
        } else {
            System.out.println("Error: Invalid Status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
