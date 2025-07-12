/*
 * (Display Leap Years) 
 * 
 * Write a program that displays all the leap years, 10 per line, from 101 to 2100, separated by
 * exactly 1 space. Also display the number of leap years in this period.
 * 
 */

public class Exercise_5_27 {
    
    public static void main(String[] args) {

        printLeapYears();
    }

    public static void printLeapYears() {

        int start = 101;
        int end = 2100;
        int count = 0;
        int lineCount = 0;

        for (int i = start; i <= end; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.print(i + " ");
                count++;
                lineCount++;

                if (lineCount == 10) {
                    System.out.println();
                    lineCount = 0;
                }
            }
        }

        // if (lineCount > 0) {
        //     System.out.println();
        // }
        System.out.println();
        System.out.println("Total leap years: " + count);
    }
}
