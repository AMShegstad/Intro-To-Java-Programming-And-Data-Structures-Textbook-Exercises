/*
 * (Geometry: point in a circle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the circle centered at
 * (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is
 * outside the circle as shown in figure 3.7, on page 115.
 * 
 * Hint: A point is in the circle if its distance to (0, 0) is less than or equal
 * to 10. The formula for computing the distance is SqR( (x2 - x1)^2 + (y2 - y1)^2 ).
 */

import java.util.Scanner;

public class exercise_3_22 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your coordinates (x and y) separated by a space");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        input.close();

        int x2 = 0;
        int y2 = 0;

        System.out.println("Your coordinates are (" + x1 + ", " + y1 + ")");

        double distance = Math.sqrt( (x2 - x1)^2 + (y2 - y1)^2);

        if (distance <= 10) {
            System.out.println("The point is in the circle");
        } else {
            System.out.println("The point is not in the circle.");
        }
    }
}
