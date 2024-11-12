/* 
 * Listing 5.11
 * 
 * (Find number divisible by 5 or 6) Write a program that displays all the numbers from
 * 100 - 200 (10 per line) that are divisible by 5 or 6, but not both. Numbers are separated
 * by exactly one space.
 */

public class Exercise_5_11 {
    
    public static void main(String[] args) {

        int size = 0;

        for (int i = 100; i <= 200; i++) {
            if ((i % 5 != 0 && i % 6 == 0) || (i % 5 == 0 && i % 6 != 0)) { 
                size++;
            }
            System.out.print(size + " ");
        }
    }
}
