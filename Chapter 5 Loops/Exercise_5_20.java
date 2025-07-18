/*
 * (Display Prime Numbers Between 2 and 1,000)
 * 
 * Modify the program given in Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive. 
 * Display eight prime numbers per line. Numbers are separated by exactly 1 space.
 */

public class Exercise_5_20 {
    
    public static void main(String[] args) {

        // final int NUMBER_OF_PRIMES = 50; // Number of prime numbers to display.
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display only 10 prime numbers per line.
        int count = 1;
        //int min = 2; // Count the number of prime numbers.
        int max = 1000;
        int number = 2; // A number to be tested for primeness.

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers.
        while (number < max) {
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
