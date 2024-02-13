
/*
 * (Cost of driving) Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles-per-gallon, and the price per gallon of the fuel,
 * the displays the cost of the trip.
 */
import java.util.Scanner;

public class exercise_2_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total distance to be traveled:");
        double distance = input.nextDouble();

        System.out.println("Enter the fuel efficiency of your car in miles-per-gallon: ");
        double mpg = input.nextDouble();

        System.out.println("Enter the cost of fuel:");
        double costPerGallon = input.nextDouble();

        input.close();

        double totalCost = (distance / mpg) * costPerGallon;

        // Using String.format to limit number to two decimal places.
        String dollarsAndCents = String.format("%.2f", totalCost);

        System.out.println("Your total fuel cost for the trip will be: " + dollarsAndCents);
    }
}
