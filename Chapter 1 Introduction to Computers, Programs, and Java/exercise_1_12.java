/*
 * (Average speed in Kilometers) Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is equal to
 * 1.6 kilometers)
 */

public class exercise_1_12 {

    public static void main(String[] args) {

        double distance = 24;
        double seconds = 35 + (40 * 60) + (60 * 60);
        double secondsPerHour = 60 ^ 2;

        System.out.println(distance + " miles were run in " + seconds + " seconds.");

        double distancePerSecond = secondsPerHour / (distance / seconds);

        System.out.println("That is equal to " + distancePerSecond + " miles per second.");

        double distancePerHour = distancePerSecond * 60 * 60;

        System.out.println("The runner was moving at " + distancePerHour + " miles per hour!");

        double kilosPerHour = distancePerHour * 1.6;

        System.out.println("This translate to " + kilosPerHour + " kilometers per hour.");
    }
}
