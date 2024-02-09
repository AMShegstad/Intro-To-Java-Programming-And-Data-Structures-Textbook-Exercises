/*
 * (Print a table) Write a pgoram that displays the following table
 *  a   a^2  a^3
 *  1    1    1
 *  2    4    8
 *  3    9    27
 *  4    16   64
 */

import java.lang.Math;

public class exercise_1_4 {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            int a = ((int) Math.pow(i, 2));
            int b = ((int) Math.pow(i, 3));
            int c = ((int) Math.pow(i, 4));
            System.out.println(a + "  " + b + "  " + c);
        }
    }
}
