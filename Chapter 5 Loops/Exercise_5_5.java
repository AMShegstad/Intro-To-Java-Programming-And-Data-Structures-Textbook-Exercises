/*
 * (Conversion from kilograms to pounds and pounds to kilograms)
 */

public class Exercise_5_5 {

    public static void main(String[] args) {

        // Variables to format header
        String kLabel = "Kilograms";
        String lbsLabel = "Pounds";
        int numLbs = 20;

        System.out.printf("%-10s %8s | %-8s %10s", kLabel, lbsLabel, lbsLabel, kLabel);

        for (int i = 0; i < 200; i += 2) {
            System.out.printf("%-10d %8.2f | %-8d %10.2f\n", i, (i * 2.2), numLbs, (numLbs / 2.2));
            numLbs = numLbs + 5;
        }
    }
}
