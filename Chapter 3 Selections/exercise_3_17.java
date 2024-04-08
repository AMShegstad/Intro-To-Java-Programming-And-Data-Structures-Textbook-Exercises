/*
 * (Game: Rock, Paper, Scissors) Write a program that plays the popular game of Rock-Paper-Scissors.
 * Scissors cuts paper, Paper covers Rock, and Rock breaks Scissors. The program randomly generates a
 * number 0, 1, or 2, and displays a message indicating whether the user or the computer wins, loses,
 * or draws.
 */
import java.util.Scanner;
import java.util.Random;

public class exercise_3_17 {
    
    public static void main(String[] args) {

        Random rand = new Random();
        int cpuChoice = rand.nextInt(3) + 1; 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors");
        int playerChoice = input.nextInt();

        input.close();
        
        if (playerChoice == 1) {
            if (cpuChoice == 1) {
                System.out.println("You chose Rock. The computer also chose Rock. It is a draw!");
            } else if (cpuChoice == 2) {
                System.out.println("You chose Rock. The computer chose Paper! The computer wins!");
            } else {
                System.out.println(" You chose Rock. The computer chose Scissors. You win!");
            }
        } else if (playerChoice == 2) {
            if (cpuChoice == 1) {
                System.out.println("You chose Paper. The computer chose Rock. You win!");
            } else if (cpuChoice == 2) {
                System.out.println("You chose Paper. The computer also chose Paper. It is a draw!");
            } else {
                System.out.println("You chose Paper. The computer chose Scissors. The computer wins!");
            }
        } else if (playerChoice == 3) {
            if (cpuChoice == 1) {
                System.out.println("You chose Scissors. The computer chose Rock. The computer wins!");
            } else if (cpuChoice == 2) {
                System.out.println("You chose Scissors. The computer chose Paper. You Win!");
            } else {
                System.out.println("You chose Scissors. The computer also chose Scissors. It is a draw!");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
