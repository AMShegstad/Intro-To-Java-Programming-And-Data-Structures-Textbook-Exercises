/*
 * AdditionQuiz.java
 */

import java.util.Scanner;

public class Listing_3_1 {

    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        // Creating a Scanner;
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        input.close();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
