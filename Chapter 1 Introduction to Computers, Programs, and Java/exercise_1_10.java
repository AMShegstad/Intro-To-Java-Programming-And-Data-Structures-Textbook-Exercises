/*
 * (Average Speed In Miles) Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * 
 *  (Not that 1 mile is equal to 1.6 Kilometers)
 */

public class exercise_1_10 {

    public static void main(String[] args) {

        double x = 45.5 / 14;
        double y = 60 / x;
        double mph = y * 1.6;

        System.out.println("The runner is moving at " + mph + " miles per hour.");

    }
}
