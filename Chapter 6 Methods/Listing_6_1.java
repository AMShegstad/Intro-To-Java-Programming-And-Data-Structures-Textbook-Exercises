/*
 * Listing 6.1 TestMax.java, pg 208
 */

public class Listing_6_1 {
    
    public static void main(String[] args) {
        int i = 54;
        int j = 24234;
        int k = max(i, j);

        System.out.println("The maximum of " + i + " and " + j + " is " + k + "!");
    }

    public static int max(int num1, int num2) {
        int result;

        if(num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
