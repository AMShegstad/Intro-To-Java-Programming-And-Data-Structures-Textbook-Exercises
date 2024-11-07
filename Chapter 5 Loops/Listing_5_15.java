/*
 * Listing 5.15
 * PrimeNumber.java
 * 
 * An integer greater than 1 is prime if its only positive divisor is 1 or itself. For example, 2, 3, 5, and 7 are prime numbers,
 * but 4, 6, 8, and 9 are not. 
 * 
 * This problem is to display the first 50 prime numbers in 5 lines, each of which contains 10 numbers. The problem can be broken
 * into the following tasks:
 * 
 *  - Determine whether a given number is prime.
 *  - for number = 2, 3, 4, 5, 6, ... test whether it is prime.
 *  - Count the prime numbers.
 *  - Display each prime number and display 10 numbers per line.
 */

public class Listing_5_15 {
    
    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50; // Number of prime numbers to display.
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display only 10 prime numbers per line.
        int count = 0; // Count the number of prime numbers.
        int number = 2; // A number to be tested for primeness.

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers.
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            //Test whether the number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0 ) { // If true, number is not prime.
                    isPrime = false; // Set isPrime to false.
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            // Check if number is prime
            number++;
        }
    }
}
