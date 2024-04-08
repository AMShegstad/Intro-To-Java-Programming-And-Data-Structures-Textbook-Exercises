/*
 * (Physics: Acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the following formula:
 * 
 *      a = (v1 - v0) / t
 * 
 * Write a program that pormpts the user to enter the starting velocity v0 in meters/second,
 * the ending velocity v1 in meters/second, and the time span in seconds, then displays 
 * the average acceleration. Here is a sample run:
 * 
 * Enter v0, v1, and t : 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */

import java.util.Scanner;

public class exercise_2_9 {

    public static void main(String[] args) {
        double acceleration;
        double velocity0;
        double velocity1;
        double time;

        Scanner input = new Scanner(System.in);

        System.out.println(
                "Please enter values for the starting velocity in meters/second, ending velocity in meters/second, and finally the time (in seconds) required:");
        velocity0 = input.nextDouble();
        velocity1 = input.nextDouble();
        time = input.nextDouble();
        input.close();

        acceleration = (velocity1 - velocity0) / time;

        System.out.println("The average acceleration is " + acceleration);

    }
}
