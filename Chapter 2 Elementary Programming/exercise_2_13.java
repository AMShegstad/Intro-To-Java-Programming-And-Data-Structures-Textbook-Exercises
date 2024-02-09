/*
 * (Financial application: compund value) Suppose you save $100 each month into
 * a savings account with an annual interest rate of 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 * 
 * 100 x (1 + 0.00417) = 100.417
 * 
 * After the second month, the value in the account becomes 
 * 
 * (100 + 100.417) x (1 + 0.00417) = 201.252
 * 
 * After the third month, the value in the account becomes 
 * 
 * (100 + 201.252) x (1 + 0.00417) = 302.507
 * 
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and displays 
 * the account value after the sixth month. 
 * 
 * 
 */

import java.util.Scanner;

public class exercise_2_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How much are you saving per month? \n");
        double savings = input.nextDouble();
        input.close();

        double amountSaved = 0;

        for (int i = 0; i < 6; i++) {
            amountSaved = (savings + amountSaved) * (1 + 0.00417);
        }

        System.out.println("After six months, you will have saved " + amountSaved);
    }

}
