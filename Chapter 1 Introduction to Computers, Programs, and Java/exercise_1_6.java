/*
 * (Summation of a series) Write a program that displays the result of
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
 */

public class exercise_1_6 {

    public static void main(String[] args) {
        int value = 0;

        for (int i = 0; i < 10; i++) {
            value = value + i;
        }

        System.out.println(value);
    }
}
