/*
 * (Conversion from miles to kilometers) Write a program that displays the following table
 * 
 * Miles       Kilometers
 * 1           1.609
 * 2           3.216
 * ...
 * 9           14.481
 * 10          16.090
 */

public class Exercise_5_4 {
    
    public static void main(String[] args) {

        String miles = "Miles";
        String kilos = "Kilometers";
        System.out.printf("%-10s %s\n", miles, kilos);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%-10d %.3f\n", i, (i * 1.609));
        }
    }
}
