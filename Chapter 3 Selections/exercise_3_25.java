/*
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and
 * (x2, y2) and on line 2 as (x3, y3) and (x4, y4). The intersecting point of the 
 * two lines can be found by solving the following lines equations;
 * 
 * ((y1 - y1) * x) - ((x1 - x2) * y) == ((y1 - y2) * x1) - ((x1 - x2) * y1)
 * 
 * and 
 * 
 * ((y3 - y4) * x) - ((x3 - x4) * y) == ((y3 - y4) * x3) - ((x3 - x4) * y3)
 * 
 * This linear equation can be solved using Cramer's rule (Programming exercise 3.3).
 * If the equation has no solutions, the two lines are parallel. Write a program that
 * prompts the user to enter four points and displays the intersecting point.
 */

public class exercise_3_25 {
    
}
