/*
 * (Approximate PI) PI can be computed using the following formula:
 * 
 * PI = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... etc)
 * 
 * So write a program that displays the result of 
 * 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11), 
 * and another that goes to 1/13. Use 1.0 instead of 1 in your program.
 */

public class exercise_1_7 {

    public static void main(String[] args) {
        double PI_1 = 4 * (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11));
        double PI_2 = 4 * (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13));

        System.out.println("PI_1 equals " + PI_1);
        System.out.println("PI_2 equals " + PI_2);
    }
}
