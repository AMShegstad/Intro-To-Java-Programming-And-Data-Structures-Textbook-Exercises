/*
 * (Compute e) 
 * 
 * You can approximate e using the following summation:
 * 
 * e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 * 
 * Write a program that displays the e value for i = 1, 2, ..., and 20. Format the number to display 16 digits
 * after the decimal point. (HINT: Because i! = i * (i-1) * ... * 2 * 1, then
 * 
 * 1/i! = 1/i(i-1)
 * 
 * Initialize e and item to be 1, and keep adding a new item to e. The new item is the previous item divided by i, 
 * for i >= 2.) 
 */

public class Exercise_5_26 {
    
    public static void main(String[] args) {

        calculateForE();
    }

    public static void calculateForE() {
        double e = 1.0;     // Start with 1 (which is 1/0!)
        double item = 1.0;  // Current term in the series
        
        System.out.printf("i = 0: e = %.16f%n", e);
        
        for (int i = 1; i <= 20; i++) {
            item = item / i;    // Previous item divided by i
            e = e + item;       // Add new item to e
            System.out.printf("i = %d: e = %.16f%n", i, e);
        }
    }
}
