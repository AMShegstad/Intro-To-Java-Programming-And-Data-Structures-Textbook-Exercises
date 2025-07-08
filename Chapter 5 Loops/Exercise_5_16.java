/* 
 * (Find the Factors of an Integer)
 * 
 * Write a program that reads an integer and displays all its smallest factors in increasing order.
 * For example, if the input is 120, the output should be 2, 2, 2, 3, 5.
 */
import java.util.Scanner;

public class Exercise_5_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("The smallest factors of " + number + " are: ");
        findSmallestFactors(number);
        input.close();
        System.out.println(); // Print a new line after displaying the factors
    }

    public static void findSmallestFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
