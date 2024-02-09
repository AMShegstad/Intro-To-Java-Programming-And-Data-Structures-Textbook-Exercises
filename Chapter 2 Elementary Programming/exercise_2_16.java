/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter 
 * the side of a hexagon and displays its area. The formula for computing the
 *  area of a hexagon is 
 * 
 *  Area = (3 x SqrRt(3) / 2) * 2s
 */

import java.util.Scanner;

public class exercise_2_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the Hexagon:");
        double side = input.nextDouble();
        input.close();

        // Let's do the math!
        double x = Math.pow(3, 0.5);
        double y = 3 * x;
        double area = (y / 2) * (side * 2);

        System.out.println("The area of the hexagon is " + area);
    }

}
