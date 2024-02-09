
/*
 * (Compute the volume of a cylinder) Write a program tghat reads in the radius and length of a cylinder 
 * and computes the area and volume using the following formulas:
 * 
 * area = radius * radius * PI;
 * volume = area * length
 */
import java.util.Scanner;

public class exercise_2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius and length of a cylinder:");

        double radius = input.nextDouble();
        double length = input.nextDouble();
        double PI = 3.1415926535;

        double area = radius * radius * PI;
        double volume = length * area;

        System.out.println("The area of the cylinder is " + area);
        System.out.println();
        System.out.println("The volume of the cylinder is " + volume);

        input.close();
    }
}
