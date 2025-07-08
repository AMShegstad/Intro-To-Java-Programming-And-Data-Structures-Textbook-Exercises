/* 
 * Listing 5.11
 * 
 * (Find number divisible by 5 or 6) Write a program that displays all the numbers from
 * 100 to 200 (10 per line) that are divisible by 5 or 6, but not both. Numbers are separated
 * by exactly one space.
 */

public class Exercise_5_11 {
    
    public static void main(String[] args) {

        int size = 0;
        int index = 0;
        final int ITEMS_PER_LINE = 10;

        for (int i = 100; i <= 200; i++) {
            if ((i % 5 != 0 && i % 6 == 0) || (i % 5 == 0 && i % 6 != 0)) { 
                size++;
            }
            else {
                continue;
            }
        }

        System.out.println(size);

        int[] divisors = new int[size];

        for (int j = 100; j <= 200; j++) {
            if (((j % 5 != 0) && (j % 6 == 0)) || ((j % 5 == 0) && (j % 6 != 0))) {
                divisors[index] = j;
                index++;
            }
            else {
                continue;
            }
        }

        for (int k = 0; k < divisors.length; k++) {
            //System.out.print(divisors[k] + " ");
            if (k % ITEMS_PER_LINE == 0) {
                System.out.println(divisors[k]);
            } else {
                System.out.print(divisors[k] + " ");
            }
        }
    }
}
