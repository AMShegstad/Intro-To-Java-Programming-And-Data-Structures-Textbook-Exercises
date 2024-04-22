/*
 * (Geometry: Point in a rectangle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is withn the rectangle centered at
 * (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle
 * and (6, 4) is outside the rectangle. (Hint: A point is in the rectangle if its 
 * horizontal distance to the center is less than or equal to half the width and
 * its vertical distance to the center is less than or equal to half the height.)
 */

import java.util.Scanner;

public class exercise_3_23 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the X and Y coordinates, separated by a column(,)");
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();

        if (x <= 5 && y <= 2.5) {
            System.out.print("The coordinates (" + x + ", " + y + ") fall within the rectangle.");
        } else {
            System.out.print("The coordinates (" + x + ", " + y + ") do not fall within the rectangle.");
        }
    }
}
