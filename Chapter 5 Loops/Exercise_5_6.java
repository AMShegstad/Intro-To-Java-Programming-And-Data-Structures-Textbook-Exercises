/*
 * (Conversion from miles to kilometers) Write a program that displays the following two tables side-by-side:
 * 
 * Miles     Kilometers  |  Kilometers     Miles
 * 1              1.609  |  20             12.430
 * 2              3.218  |  25             15.538
 * ...
 * 9             14.481  |  60             37.290
 * 10            16.090  |  65             40.398
 */

public class Exercise_5_6 {
    
    public static void main(String[] args) {

        String mLabel = "Miles";
        String kmLabel = "Kilometers";
        int numKm = 20;

        System.out.printf("%-7s %7s | %-7s %7s\n", mLabel, kmLabel, kmLabel, mLabel);

        for (int i = 1; i < 10; i++) {
            System.out.printf("%-8d %9.2f | %-8d %9.2f\n", i, (i * 1.609), numKm, (numKm / 1.609));
            numKm = numKm + 5;
       }
    }
}
