/*
 * (Display four patterns using loops)
 *
 * Use nested loops that display the following patterns in four separate programs.
 */

public class Exercise_5_18 {
    
    public static void main(String[] args) {
        displayPatterns();
    }

    public static void displayPatterns() {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }

    public static void pattern1() {
        System.out.println("Pattern 1: ");
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2() {
        System.out.println("Pattern 2: ");
        System.out.println();

        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // for (int k = 1; k > 0; k++) {
            //     System.out.print("  ");
            // }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern3() {
        System.out.println("Pattern 3: ");
        System.out.println();
        
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i - 1; k--) {
                System.out.print((6 - k) + " ");
            }
            //for (int k = 1)
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern4() {
        System.out.println("Pattern 4: ");
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
