/*
 * (Demonstrate Cancellation Errors)
 * 
 * A Cancellation error occurs when you are manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number. For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. To
 * avoid cancellation errors and obtain more accurate results, carefully select the order of computation. For example,
 * in computing the following summation, you will obtain more accurate results by computing from right to left rather
 * than from left to right.
 * 
 * 1 + 1/2 + 1/3 + ... + 1/n
 * 
 * Write a program that compares the results of the summation of the proceeding series, computing from left to right and
 * from right to left with n = 50000.
 */

public class Exercise_5_23 {
    
    public static void main(String[] args) {

        System.out.print(leftToRight());
        System.out.println();
        System.out.print(rightToLeft());
    }

    public static double leftToRight() {
        int n = 50000;
        double x = 0;

        for (double i = 1; i <= n; i++ ) {
            x = x + ( 1/i );
        }

        return x;
    }

    public static double rightToLeft() {
        double x = 0;
        
        for (double i = 50000; i > 0; i--) {
            x = x + ( 1/i );
        }

        return x;
    }
}
