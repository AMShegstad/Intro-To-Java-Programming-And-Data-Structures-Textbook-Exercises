/*
 * (Health Application: Computer BMI) Body Mass Index (BMI) is a measure of health on weight.
 * It can be calculated by taking your weight in kilograms and dividing by the square of your 
 * height in meters. Write a program that prompts the user to enter a weight in pounds and
 * height in inches and displays the BMI. Note, one pound is 0.45359237 kilograms and one inch
 * is 0.0254 meters.
 *
 */

import java.util.Scanner;

public class exercise_2_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds(lbs):");
        double pounds = input.nextDouble();

        System.out.println("Please enter your height in inches:");
        double inches = input.nextDouble();

        double kilos = pounds * 0.45359327;
        double meters = inches * 0.0254;

        double BMI = kilos / Math.pow(meters, 2);

        System.out.println("Your BMI is " + BMI);

    }

}
