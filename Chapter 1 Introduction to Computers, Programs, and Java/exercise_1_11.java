/*
 * (Population Projection) The U.S. Census Bureau projects the population based on the 
 * following assumptions:
 * 
 * -- One birth every 7 seconds
 * -- One death every 13 seconds
 * -- One new immigrant every 45 seconds
 * 
 * Write a program to display the population for each of the next five years. Assume 
 * that the current population is 312,032,486, and one yeae has 365 days. HINT: In Java,
 * if two integers perform division, the result is an Integer. The fractional part is truncated.
 * For example, 5 / 4 is 1, not (1.25) and 10/4 = 2 (not 2.5). To get an accurate result with the 
 * franctional part, one of the values involved in the division must be a number with a decimal
 * point. For example, 5.0 / 4 is 1.25, and 10 / 4.0 is 2.5 
 */

public class exercise_1_11 {

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
