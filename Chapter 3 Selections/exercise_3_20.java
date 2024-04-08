/*
 * (Science: Wind-chill temperature) Programming Exercise 2.17 gives a formula to compute
 * the wind-chil temperature. The formula is valid for temperatures in the range between
 * -58F and 41F and wind-speed greater than or equal to 2. Write a program that prompts 
 * the user to enter a temperature and a wind speed. The program displays the wind-chill
 * temperature if the input is valid; otherwise, it displays a message indicating whether
 * the temperature and/or wind-speed is invalid.
 * 
 * Exercise 2.17 is as follows:
 * 
 *     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature between -58 degree Fahrenheit and 41 Degrees Fahrenheit:");
        double ta = input.nextDouble();

        System.out.println("Enter the wind speed equal to or greater than 2:");
        double v = input.nextDouble();
        input.close();

        double ve = Math.pow(v, 0.16);

        double twc = 35.74 + (0.6215 * (ta)) - (35.75 * ve) + (0.4275 * ta * ve);

        System.out.println("The wind chill index is: " + twc);

    }
 */

import java.util.Scanner;

public class exercise_3_20 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature between -58 degree Fahrenheit and 41 Degrees Fahrenheit:");
        double ta = input.nextDouble();

        System.out.println("Enter the wind speed equal to or greater than 2:");
        double v = input.nextDouble();
        input.close();

        if (ta < -58 || ta > 41 && v < 2) {
            System.out.println("Both the initial temperature and the wind speed are invalid.");
        } else if (ta < -58 || ta > 41) {
            System.out.println("The temperature is invalid.");
        } else if (v < 2) {
            System.out.println("The wind-speed is invalid");
        } else {

            double ve = Math.pow(v, 0.16);
            double twc = 35.74 + (0.6215 * (ta)) - (35.75 * ve) + (0.4275 * ta * ve);
            System.out.println("The wind chill index is: " + twc);
        }

    }
}
