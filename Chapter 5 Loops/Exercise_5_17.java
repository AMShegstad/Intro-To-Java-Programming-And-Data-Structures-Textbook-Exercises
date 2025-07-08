/*
 *  (Display Pyramid) Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:
 */

 import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 15: ");
        int n = input.nextInt();
        System.out.println("behold, your Pyramid!");
        displayPyramid(n);
        input.close();
    }   

    public static void displayPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  "); // Two spaces to account for number + space
            }
            
            // Print left side of pyramid (descending)
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            
            // Print right side of pyramid (ascending, starting from 2)
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println();
        }
    }
}
