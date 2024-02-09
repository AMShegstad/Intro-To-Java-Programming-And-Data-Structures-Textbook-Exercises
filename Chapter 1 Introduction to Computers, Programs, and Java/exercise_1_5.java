/*
 * (Compute Expressions) Write a Program that Displays the result of
 * (9.5 x 4.5 - 2.5 x 3) / (45.5 - 3.5)
 */

public class exercise_1_5 {

    public static void main(String[] args) {

        double a = 9.5;
        double b = 4.5;
        double c = 2.5;
        double d = 3;
        double e = 45.5;
        double f = 3.5;

        double result = (a * b - c * d) / (e - f);

        System.out.println(result);
    }
}
