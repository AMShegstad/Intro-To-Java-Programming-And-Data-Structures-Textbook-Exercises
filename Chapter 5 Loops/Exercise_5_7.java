/*
 * (Financial Application: compute future tuition) Suppose the tuition for university is $10,000 this year
 * and increases 5% every year. In one year, the tuition will be %10,500. Write a program that displays the
 * tuition in 10 years and, and the total cost of four years' worth of tuition starting after the tenth year.
 */

public class Exercise_5_7 {

    public static void main(String[] args) {

        double tuition = 10000;
        float fullTuition = 0;

        for (int i = 0; i < 10; i++) {
             tuition = tuition + (tuition * 0.05);
        }

        System.out.printf("After ten years, the tuition cost is now $%.2f\n", tuition);

        for (int j = 0; j < 5; j++) {
            tuition = tuition + (tuition * 0.05);
            fullTuition += tuition;
        }

        System.out.printf("Starting ten years from now, a 4 year education will cost in total $%.2f\n", fullTuition);
    }
    
}
