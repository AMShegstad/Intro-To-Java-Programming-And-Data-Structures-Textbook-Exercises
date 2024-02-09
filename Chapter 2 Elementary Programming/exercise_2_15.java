
/*
 * (Geometry: Distance of Two Points) Write a program that prompts the user
 * to enter two points (x1, y1) and (x2, y2) and displays their distance. 
 * The formula for computing distance is The SqrRt of (x2 - x1) + (y2 - y1).
 * 
 * You can use Math.pow(a, 0.5) to compute the SqrRt of a.
 */
import java.util.Scanner;

public class exercise_2_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and x2:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter y1 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        input.close();

        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        double a = x + y;
        double distance = (double) Math.pow(a, 0.5);

        System.out.println("The distance between the two points is " + distance);

    }
}
