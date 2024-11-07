/*
 * (Conversion from kilograms to pounds) Write a program that displays the following table (note: 1 kilogram is 2.2 pounds)
 */

public class Exercise_5_3 {
    
    public static void main(String[] args) {

        String kilos = "Kilograms";
        String lbs = "Pounds";
        System.out.printf("%-10s %s\n", kilos, lbs);
        for (int i = 1; i < 200; i+=2) {
            System.out.printf("%-10d %.2f\n", i, (i * 2.2));
        }
    }
}
