/*
 * Listing 5.13
 * ... You can also use the 'continue' keyword in a loop. When it is encountered, it
 * ends the current iteration and program control goes to the end of the loop body.
 * In other words, 'continue' breaks out of an iteration while 'break' breaks out of
 * a loop. The following program demonstrates the effect of using continue in a loop.
 */

public class Listing_5_13 {
    
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }

        System.out.println("The sum is " + sum + ".");
    }
}
