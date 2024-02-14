
/*
 * (Game: add three numbers) The program in listing 3.1, AdditionQuiz.java, 
 * generates two integers and prompts the user to enter the sum of these two
 * integers. Revise the program the genrate three single-digit integers and
 * prompt the user to enter the sum of these three integers.
 * 
 * Listing 3.1 is as follows;
 * 
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        // Creating a Scanner;
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        input.close();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

 */
import java.util.Scanner;

public class exercise_3_2 {

    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        int number3 = (int) (Math.random() * 10);
        int sum = number1 + number2 + number3;

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "?");
        int answer = input.nextInt();
        input.close();

        if (answer == sum) {
            System.out.println("Correct! the answer is " + sum);
        } else {
            System.out.println("Incorrect. The answer is " + sum);
        }
    }
}
