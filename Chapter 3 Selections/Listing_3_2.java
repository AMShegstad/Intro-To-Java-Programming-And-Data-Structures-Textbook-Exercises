/*
 * SimpleIfDemo.java
 */

import java.util.Scanner;

public class Listing_3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        input.close();

        if (number % 5 == 0) {
            System.out.println("HiFive!");
        }

        if (number % 2 == 0) {
            System.out.println("HiEven!");
        }

    }
}
