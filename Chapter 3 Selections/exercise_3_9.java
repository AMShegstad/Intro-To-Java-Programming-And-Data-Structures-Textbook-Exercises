/*
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 1o digits: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. The last digit, d10,
 * is a checksum, which is calculated from the other 9 digits using the 
 * following formula:
 * 
 * (d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d 8x 8 + d9 x 9) % 11
 * 
 * If the checksum is 10, the last digit is denoted as X according to the 
 * ISBN-10 convention. Write a program that prompts the user to enter the first
 * 9 digits and displays the 10-digit ISBN (including leading zeroes). The 
 * program should read the input as an integer.
 */

import java.util.Scanner;

public class exercise_3_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first nine digits of an ISBN as an integer: ");
        System.out.print("Digit 1: ");
        int d1 = input.nextInt();
        System.out.print("Digit 2: ");
        int d2 = input.nextInt();
        System.out.print("Digit 3: ");
        int d3 = input.nextInt();
        System.out.print("Digit 4: ");
        int d4 = input.nextInt();
        System.out.print("Digit 5: ");
        int d5 = input.nextInt();
        System.out.print("Digit 6: ");
        int d6 = input.nextInt();
        System.out.print("Digit 7: ");
        int d7 = input.nextInt();
        System.out.print("Digit 8: ");
        int d8 = input.nextInt();
        System.out.print("Digit 9: ");
        int d9 = input.nextInt();
        input.close();

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10) {
            System.out.println("Your completed ISBN-10 is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            System.out.println("Your completed ISBN-10 is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }
    }

}
