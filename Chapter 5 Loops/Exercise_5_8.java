/*
 * (Find the highest score) Write a program that prompts the user to enter the number
 * of students and each student's name and score, and finally displays the student with
 * the highest score. Use the next() method in the Scanner class to read a name, rather
 * than using the nextLine() method. Assume that the number of students is at least one.
 */

import java.util.Scanner;

public class Exercise_5_8 {
    
    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the data...
        System.out.println("How many students are in the class?\n");
        int numStudents = input.nextInt();
        String name[] = new String[numStudents];
        double score[] = new double[numStudents]; 

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of the student followed by their test score: \n");
            name[i] = input.next();
            score[i] = input.nextDouble();
        }

        input.close();

        for (int j = 1; j < numStudents ; j++) {
            if (score[0] < score[j]) {
                double temp = score[0];
                score[0] = score[j];
                score[j] = temp;
            }
        }
    
        System.out.printf("The highest score belonged to %s who scored a %.2f.\n", name[0], score[0]);
    }
}
