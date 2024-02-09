
/*
 * (Area and Perimeter of a Circle) Write a Program that displays the area and perimeter 
 * of a circle that has a radius of 5.5 using the following formulas:
 * 
 *  Perimeter = 2 X Radius X PI
 * 
 *  Area = Radius X Radius X PI
 */
import java.lang.Math;

public class exercise_1_8 {

    public static void main(String[] args) {

        double PI = 3.141592653;
        double radius = 5.5;

        System.out.println(getPerimeter(PI, radius));
        System.out.println(getArea(PI, radius));
    }

    public static double getPerimeter(double pi, double rad) {

        double perimeter = 2 * rad * pi;

        return perimeter;
    }

    public static double getArea(double pi, double rad) {

        double area = (Math.pow(rad, 2)) * pi;

        return area;
    }
}
