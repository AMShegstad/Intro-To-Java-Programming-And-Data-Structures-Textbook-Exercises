/*
Listing 5.4
SubtractionQuizLoop.java
 */

import java.util.Scanner;

public class Listing_5_4 {

    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 5; // number of questions.
        int correctCount = 0; // Count the number of correct answers.
        int count = 0; // Count then number of questions.
        long startTime = System.currentTimeMillis();
        String output = " "; // output String is initially empty.
        Scanner input = new Scanner(System.in); // Creating the Scanner object

        while (count < NUMBER_OF_QUESTIONS) {

            // 1. Generate two random single-digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer "What is number1 - number2?"
            System.out.print("What is " + number1 + " - " + number2 + "?");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.print("You are correct!\n");
                correctCount++; // Increase correct answer count.
            } else {
                System.out.println("Your answer is incorrect.\n" + number1 + " - " + number2 + " is " + (number1 - number2));
            }

            count++;

            output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct": " wrong");
        }
        input.close();
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
