/*
 * (Sum a series) 
 * 
 * Write a program to compute the following summnation:
 * 
 * 1/3 + 3/5 + 5/7 + 7/9 + 11/13 + ... + 95/97 + 97/99
 */

public class Exercise_5_24 {

    public static void main(String[] args) {

        double x = 99;

        System.out.println(calculation(x));
    }

    public static double calculation(double x) {

        double result = 0; 

        for (double i = x; i - 2 > 0; i--) {
            result = result + ((x - 2) / (x));
        }

        return result;
    }
}
