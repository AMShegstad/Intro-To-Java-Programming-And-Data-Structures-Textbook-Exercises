/*
 * (Algebra: Solve Quadratic Equations) The two roots of a quadratic equation
 * ax^2 + bx + c = 0 can be obtained using the following formula:
 * 
 * r1 = -b + sqrt(b^2 - 4ac) / 2a
 * 
 *              and 
 * 
 * r2 = -b - sqrt(-b^2 - 4ac) / 2a
 * 
 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is
 * positive, the equation has two real roots. If it is zero, the equation has
 * one root. If it is negative, the equation has no real roots.
 * 
 * Write a program that prompts the user to enter values for a, b, and c, 
 * then displays the result based on the discriminant. If the disicriminant is
 * positive, display two roots. If the discriminant is 0, display one root. 
 * Otherwise, display "The equation has no real roots."
 */

import java.util.Scanner;

public class exercise_3_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();

        System.out.println("Enter the value of c:");
        double c = input.nextDouble();

        input.close();

        double discriminant = (Math.pow(b, 2)) - (4 * (a * c));

        if (discriminant > 0) {
            System.out.println("The equation has two real roots.");
        } else if (discriminant == 0) {
            System.out.println("The equation has one real root.");
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        }
    }
}
