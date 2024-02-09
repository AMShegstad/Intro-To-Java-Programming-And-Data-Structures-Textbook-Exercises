/*
 * (Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial
 * temperature to a final temperature. Your program should prompt the user to enter the amount of water in kilo-
 * grams and the initial and final temperatures of the water. The formula to compete the energy is:
 * 
 * Q = M * (finalTemperature - initialTemperature) * 4184;
 * 
 * where M is the weight of the water in kilograms, inital and final temperatures are in degrees Celsius, and 
 * energy Q is measured in joules. Here is a sample run:
 * 
 *      Enter the amount of water in kilograms: 55.5 [ENTER]
 *      Enter the initial temperature: 3.5 [ENTER]
 *      Enter the final temperature: 10.5 [ENTER]
 *      The energy needed is 1625484.0
 * 
 */

import java.util.Scanner;

public class exercise_2_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the weight of water in kilos, the inital temp
        // (C), and the final temp (C)
        System.out.println(
                "Please enter the weight of the water (in kilograms), the initial temperature (Celsius), and the final temperature (Celsius):");
        double m = input.nextDouble();
        double initialTemp = input.nextDouble();
        double finalTemp = input.nextDouble();

        double q = m * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is: " + q);
    }

}
