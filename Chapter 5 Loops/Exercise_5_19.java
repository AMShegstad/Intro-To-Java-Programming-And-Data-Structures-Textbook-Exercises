/*
 * (Display Numbers in a Pyramid Pattern)
 * 
 * Write a nested loop that prints the following output:
 * 
 *                                1
 *                           1    2    1
 *                      1    2    4    2   1
 *                 1    2    4    8    4   2   1  
 *             1   2    4    8   16    8   4   2   1
 *         1   2   4    8   16   32   16   8   4   2   1
 *     1   2   4   8   16   32   64   32  16   8   4   2   1
 * 1   2   4   8   16  32   64  128   64  32  16   8   4   2   1
 */

public class Exercise_5_19 {
    
    public static void main(String[] args) {

        displayPyramid();
    }

    public static void displayPyramid() {
        int rows = 8; // Number of rows in the pyramid
        
        // Find the maximum number that will appear (2^(rows-1))
        int maxNumber = (int) Math.pow(2, rows - 1);
        
        // Calculate the width needed for the largest number
        int maxWidth = String.valueOf(maxNumber).length();
        
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(getSpaces(maxWidth));
            }
            
            // Print left side (powers of 2)
            for (int k = 0; k < i; k++) {
                int value = (int) Math.pow(2, k);
                System.out.print(formatNumber(value, maxWidth));
            }
            
            // Print right side (powers of 2 in reverse, excluding the center)
            for (int k = i - 2; k >= 0; k--) {
                int value = (int) Math.pow(2, k);
                System.out.print(formatNumber(value, maxWidth));
            }
            
            System.out.println();
        }
    }

    // Helper method to format numbers with consistent width
    private static String formatNumber(int number, int width) {
        return String.format("%" + width + "d ", number);
    }

    // Helper method to create spaces of consistent width
    private static String getSpaces(int width) {
        return String.format("%" + (width + 1) + "s", "");
    }
}
