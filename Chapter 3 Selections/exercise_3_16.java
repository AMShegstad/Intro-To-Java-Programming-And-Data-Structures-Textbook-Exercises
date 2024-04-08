/*
 * (Random Point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0,0), has a width of 100, and a height of 200.
 */
import java.util.Random;

public class exercise_3_16 {
    
    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt(100);
        int y = rand.nextInt(200);

        int xAxis = x - 50;
        int yAxis = y - 100;

        System.out.println("Coordinate: (" + xAxis + "," + yAxis + ")");
    }
}
