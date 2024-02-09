/*
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 * 
 * HINT: Use the % operator to extract digits, and use the / operator to remove the 
 * extracted digit. For instance, 932 % 10 = 2, and 932 / 10 = 93
 */

import java.util.Scanner;

public class exercise_2_6_COMEBACKTOTHIS {

    public static void main(String[] args) {

        // Creating the scanner object for console input
        Scanner input = new Scanner(System.in);

        // Prompting the user for an integer.
        System.out.println("Please enter an integer between 0 and 1000:");
        int integer = input.nextInt();
        /*
         * if (integer <= 1000) {
         * int number1 = getThousands(integer);
         * int number2 = getHundreds(integer);
         * int number3 = getTens(integer);
         * int number4 = getOnes(integer);
         * 
         * int result = number1 + number2 + number3 + number4;
         * 
         * System.out.println("All of the digits in " + integer + " add up to " +
         * result);
         * }
         * }
         * 
         * public static int getThousands(int integer) {
         * int i1;
         * if (integer == 1000) {
         * i1 = 1;
         * } else {
         * i1 = 0;
         * }
         * return i1;
         * }
         */
        /*
         * public static int getHundreds(int integer) {
         * int i2 = 0;
         * 
         * if (integer <= 999) {
         * i2 = integer % 10;
         * }
         * 
         * 
         * return i2;
         * }
         * 
         * public static int getTens(int integer) {
         * int i3 = 0;
         * 
         * return i3;
         * 
         * }
         * 
         * public static int getOnes(int integer) {
         * int i4 = 0;
         * 
         * return i4;
         * }
         */

    }
}