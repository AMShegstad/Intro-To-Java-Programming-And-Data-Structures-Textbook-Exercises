/*
Listing 5.8
TestSum.java

Numeric errors involving floating-point number are inevitable, because floating-point numbers are represented in approximation in computers by
nature. This section discusses how to minimize such errors through such an example. This listing presents an example summing a series that starts 
with 0.01 and ends with 1.0. The numbers in the series will increment by 0.01, as follows: 0.01 + 0.02 + 0.03, and so on.

Note: In the creation of the for loop, the 'f' after the decimal number simply signifies that it is to be treated as a single-precision floating
point number. Not using the 'f' can result in the number being saved as a double. Using a float data type helps when you want to save memory and
when calculations don't require more than 6 or 7 decimal places.
 */

public class Listing_5_8 {

    public static void main(String[] args) {

        // Initialize sum
        float sum = 0;

        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
