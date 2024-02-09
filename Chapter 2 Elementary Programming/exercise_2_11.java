/*
 * (Population Projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and
 * display the population after the number of years. Use the hint in Programming Exercise 1.11 for this program. 
 * 
 * Here is a sample run of the program:
 * 
 * 'Enter the number of years' 5 [ENTER]
 * The population in 5 years is 325932969
 * 
 * 
 * public class exercise_1_11 {

    public static void main(String[] args) {
        long population = 312_032_486;
        long day = 365;
        long hoursPerYear = day * 24;
        long minutesPerYear = hoursPerYear * 60;
        long secondsPerYear = minutesPerYear * 60;
        long births = secondsPerYear / 7;
        long deaths = secondsPerYear / 13;
        long immigrants = secondsPerYear / 45;

        for (int i = 0; i < 5; i++) {
            population = addBirths(population, births);
            removeDeaths(population, deaths);
            addImmigrants(population, immigrants);

            System.out.println("Population after year #" + i + " is " + population);
        }

        System.out.println("After five years, the population is now " + population);
    }

    public static long addBirths(long pop, long birthrate) {
        pop = pop + birthrate;
        return pop;
    }

    public static long removeDeaths(long pop, long deathrate) {
        pop = pop - deathrate;
        return pop;
    }

    public static long addImmigrants(long pop, long immigrants) {
        pop = pop + immigrants;
        return pop;
    }
}
 */

import java.util.Scanner;

public class exercise_2_11 {

    public static void main(String[] args) {

        // Defining how parameters are calculated
        long population = 312_032_486;
        long day = 365;
        long hoursPerYear = day * 24;
        long minutesPerYear = hoursPerYear * 60;
        long secondsPerYear = minutesPerYear * 60;
        long births = secondsPerYear / 7;
        long deaths = secondsPerYear / 13;
        long immigrants = secondsPerYear / 45;

        // Gotta get that user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years:\n");
        long years = input.nextLong();
        input.close();

        for (int i = 0; i < years; i++) {
            population = addBirths(population, births);
            removeDeaths(population, deaths);
            addImmigrants(population, immigrants);

            System.out.println("Population after year #" + i + " is " + population);
        }

        System.out.println("After " + years + " years, the population is now " + population);
    }

    public static long addBirths(long pop, long birthrate) {
        pop = pop + birthrate;
        return pop;
    }

    public static long removeDeaths(long pop, long deathrate) {
        pop = pop - deathrate;
        return pop;
    }

    public static long addImmigrants(long pop, long immigrants) {
        pop = pop + immigrants;
        return pop;
    }
}
