
/*
 * (Sort Three Numbers) Write a program that prompts the user to enter three
 * integers and display the integers in non-decreasing order.
 */
import java.util.Scanner;

public class exercise_3_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers, separated by spaces:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        input.close();

        /*
         * From listing 3.3
         * if (number1 < number2) {
         * int temp = number 1;
         * number1 = number2;
         * number2 = temp;
         * }
         * 
         * The book hasn't gone over while statements yet, but this solution made the
         * most sense to me, so I went ahead and did it. Booyah.
         */

        while (number1 > number2 || number2 > number3 || number1 > number3) {

            if (number1 > number2) {
                int temp1 = number1;
                number1 = number2;
                number2 = temp1;
            }

            if (number2 > number3) {
                int temp2 = number2;
                number2 = number3;
                number3 = temp2;
            }

            if (number1 > number3) {
                int temp3 = number1;
                number1 = number3;
                number3 = temp3;
            }
        }
        System.out.println(number1 + "\n" + number2 + "\n" + number3);

    }
}
