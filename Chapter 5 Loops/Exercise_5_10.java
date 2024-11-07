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
        int count = 0;
        boolean correctDivisor = true;

        System.out.println("The number between 100 and 1000 that are divisible by both 5 and 6 are: \n");

        for (int i= 100; i < 1000; i++) {
            if (i % 5 != 0 || i % 6 != 0) {
                correctDivisor = false;
            }
        }
    }
}
