/*
Listing 5.3
TestDoWhile.java

"Use a do-while loop if you have statements inside the loop that must be executed at least once, as is the case of the
do-while loop in the following example. These statements must appear before the loop as well as inside it if you use a
while loop.
 */

import java.util.Scanner;

public class Listing_5_6 {

    public static void main(String[] args) {

        int data;
        int sum = 0;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0) : ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        input.close();

        System.out.println("The sum is " + sum);
    }
}
