
/*
 * (Algebra: solve 2 x 2 linear equations) A linear equation can be solved using 
 * Cramer's rule given in Programming Exercise 1.13 Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc = 0,
 * report that "The equation has no solution."
 * 
 * ax + by = e
 * 
 * cx + dy = f
 * 
 * x = (ed - bf)/(ad - bc)
 * y = (af - ec)/(ad - bc)
 */
import java.util.Scanner;

public class exercise_3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value for b: ");
        double b = input.nextDouble();

        System.out.println("Enter the value for c: ");
        double c = input.nextDouble();

        System.out.println("Enter the value for d: ");
        double d = input.nextDouble();

        System.out.println("Enter the value for e: ");
        double e = input.nextDouble();

        System.out.println("Enter the value for f: ");
        double f = input.nextDouble();

        double x = ((e * d) / (b * f)) / ((a * d) / (b * c));
        double y = ((a * f) / (e * c)) / ((a * d) / (b * c));

        if (((a * d) - (b * c)) == 0) {

            System.out.println("The equation has no solution.");
        } else {
            System.out.println("x is " + x + " and y is " + y);
        }

    }
}
