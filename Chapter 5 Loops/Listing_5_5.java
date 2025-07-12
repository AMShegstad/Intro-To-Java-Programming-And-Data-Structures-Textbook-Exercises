/*
Listing 5.5
SentinelValue.java

"Another common technique for controlling a loop is to designate a special value when reading and processing a set of
values. This special input value, known as a sentinel value, signifies the end of the input. A loop that uses a sentinel
value to control its execution is called a sentinel-controlled loop.
 */

import java.util.Scanner;

public class Listing_5_5 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.println("Enter an Integer (the input ends if it is 0) : ");
        int data = input.nextInt();

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // Read the next data
            System.out.println("Enter an integer (The input ends if it is 0) : ");
            data = input.nextInt();
        }
        input.close();

        System.out.println("The sum is " + sum);
    }
}
