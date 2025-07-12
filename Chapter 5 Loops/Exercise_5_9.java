/*
 * (Find the two highest scores) Write a program that prompts the user to enter the
 * number of students and each student's name and score, and finally displays the student
 * with the highest score, and the student with the second-highest score.
 */

import java.util.Scanner;

public class Exercise_5_9 {

   public static void main(String[] var0) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.println("How many students are in the class?\n");
         int var2 = input.nextInt();
         String[] var3 = new String[var2];
         double[] var4 = new double[var2];

         int var5;
         for (var5 = 0; var5 < var2; ++var5) {
            System.out.println("Enter the name of the student followed by their test score: \n");
            var3[var5] = input.next();
            var4[var5] = input.nextDouble();
         }

         double var6;
         for (var5 = 1; var5 < var2; ++var5) {
            if (var4[0] < var4[var5]) {
               var6 = var4[0];
               var4[0] = var4[var5];
               var4[var5] = var6;
            }
         }

         for (var5 = 2; var5 < var2; ++var5) {
            if (var4[1] < var4[var5]) {
               var6 = var4[0];
               var4[1] = var4[var5];
               var4[var5] = var6;
            }
         }

         System.out.printf("The highest score belonged to %s who scored a %.2f.\n", var3[0], var4[0]);
         System.out.printf("The second-highest score belongs to %s who scored a %.2f", var3[1], var4[1]);
      }
   }
}
