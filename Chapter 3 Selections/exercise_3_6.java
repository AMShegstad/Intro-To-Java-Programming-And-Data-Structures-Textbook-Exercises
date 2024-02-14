/*
 * (Health Application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, 
 * to let the user enter their weight, feet, and inches. For example, if a
 * person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
 * 
 * Listing 3.4 is as follow:
 * 
 *         Scanner input = new Scanner(System.in);

        // prompt the user to enter weight in pounds.
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches.
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        input.close();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display Results
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
 */

import java.util.Scanner;

public class exercise_3_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in feet and inches, separated by a space:");
        double feet = input.nextDouble();
        double inches = input.nextDouble();

        double height = (feet * 12) + inches;

        input.close();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display Results
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
