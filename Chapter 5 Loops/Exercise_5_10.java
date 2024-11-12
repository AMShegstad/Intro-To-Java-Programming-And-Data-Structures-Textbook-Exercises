/*
 * Exercise 5.10
 * 
 * (Find the numbers divisible by 5 & 6) Write a program that displays all the numbers
 * from 100 to 1000 (10 per line) that are divisible by both 5 and 6. Numbers are separated
 * by exactly one space.
 */

public class Exercise_5_10 {
    
    public static void main(String[] args) {

        final int ITEMS_PER_LINE = 10;
        int number = 100; // numbers to test as divisor
        int count = 0;

        for (int j = 100; j <= 1000; j++){
            if (j % 5 != 0 && j % 6 != 0) {
                count++;
            }
        }

        int divisors[] = new int[count];
        System.out.println("The number between 100 and 1000 that are divisible by both 5 and 6 are: \n");
        System.out.println(count);
        System.out.println(divisors.length);

        /*
        while (number <= 1000) {*/
            // Test whether the number meets the conditions.
            for (int i = 0; i < divisors.length; i++) {
                if (i % 5 == 0 && i % 6 == 0) { // If true, number is not a correct divisor
                    divisors[i] = number;
                } else {
                    continue;
                }
                index++;
                number++;
            }
        /* }
        */

        for (int k = 0; k < divisors.length; k++) {
            if (k % ITEMS_PER_LINE == 0) {
                System.out.println(divisors[k]);
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
