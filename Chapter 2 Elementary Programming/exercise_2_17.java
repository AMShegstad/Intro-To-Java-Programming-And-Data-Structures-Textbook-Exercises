/*
 * (Science: wind-chill temerature) How cold is it outside? The temperature is not enough to
 * provide the answer. Other factors including wind speed, relative humidity, and sunshine
 * play important roles in determining coldness outside. In 2001, the National Weather
 * Service (NWS) implemented the new wind-chill temperature to measure coldness using
 * temperature and wind speed. The formula is 
 * 
 *      twc = 35.74 + 0.6215(ta) - 35.75v^0.16 + 0.4275(ta)v^0.16
 * 
 * where (ta) is the outside temperature measured in degrees fahrenheit, v is the speed 
 * measured in miles per hour, and (twc) is the wind-chill temperature. The formula cannot
 * be used for wind speeds below 2mph or temperatures below -58 degrees Fahrenheit or above 
 * 41 degrees Fahrenheit.
 * 
 * Write a program that prompts the user to enter a temperature between -58 degrees Fahrenheit
 * and 41 degrees Fahrenheit and a wind speed greater than or equal to 2 then displays the
 * wind-chill temperature. Use Math.pow(a, b) to compute v^0.016. 
 */

import java.util.Scanner;

public class exercise_2_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature between -58 degree Fahrenheit and 41 Degrees Fahrenheit:");
        double ta = input.nextDouble();

        System.out.println("Enter the wind speed equal to or greater than 2:");
        double v = input.nextDouble();

        double ve = Math.pow(v, 0.16);

        double twc = 35.74 + (0.6215 * (ta)) - (35.75 * ve) + (0.4275 * ta * ve);

        System.out.println("The wind chill index is: " + twc);

    }
}
