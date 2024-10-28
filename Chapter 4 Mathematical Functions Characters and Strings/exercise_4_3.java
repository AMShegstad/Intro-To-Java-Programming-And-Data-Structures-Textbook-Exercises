/*
(Geography: estimate area) Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte,
North Carolina used in figure in Section 4.1 to compare the estimated area enclosed by these four cities. (Hint: Use the
formula in Programming Exercise 4.2 to compute the distance between two cities. Divide the polygon into two triangles, and
use the formula in Programming Exercise 2.19 to compute the area of a triangle.
 */

/* Exercise 2.19
 * (Geometry of a Triangle) Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), and
 * (x3, y3), of a triangle then displays its area. The formula for computing the area of a triangle is:
 *
 * s = (side1 + side2 + side3) / 2
 *
 * area = SqrRt( s *(s - side1)(s - side2)(s - side3) )
 */

public class exercise_4_3 {

    public static void main(String[] args) {

        // Longitude(x) and Latitude(y) of Charlotte, North Carolina.
        double cx = Math.toRadians(35.2270869);
        double cy = Math.toRadians(-80.8431267);

        // Longitude(x) and Latitude(y) of Savannah, Georgia.
        double sx = Math.toRadians(32.0835407);
        double sy = Math.toRadians(-81.0998342);

        // Longitude(x) and Latitude(y) of Orlando, Florida.
        double ox = Math.toRadians(28.5383355);
        double oy = Math.toRadians(-81.3792365);

        // Longitude(x) and Latitude(y) of Atlanta Georgia.
        double ax = Math.toRadians(33.7489954);
        double ay = Math.toRadians(-84.3879824);

        // Approximate radius of the Earth.
        double radius = 6371.01;

        /*
        Triangle 1 = Charlotte, Atlanta, and Savannah.
        Triangle 2 = Atlanta, Savannah, and Orlando.
                            or
        Triangle 1 = Charlotte, Atlanta, and Orlando.
        Triangle 2 = Charlotte, Savannah, and Orlando.
        ----------------------------------------------------------------------------
        Time to take the formula from the previous
        exercise and use it to calculate the sides of each triangle!

        distance = radius * acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)
        */

        // Triangle 1, side 1 -> Charlotte to Atlanta
        double t1s1 = radius * Math.acos(Math.sin(cx) * Math.sin(ax) + Math.cos(cx) * Math.cos(ax) * Math.cos(cy - ay));
        // Triangle 1, side 2 -> Atlanta to Savannah
        double t1s2 = radius * Math.acos(Math.sin(ax) * Math.sin(sx) + Math.cos(ax) * Math.cos(sx) * Math.cos(ay - sy));
        // Triangle 1, side 3 -> Charlotte to Savannah
        double t1s3 = radius * Math.acos(Math.sin(cx) * Math.sin(sx) + Math.cos(cx) * Math.cos(sx) * Math.cos(cy - sy));

        // Triangle 2, side 1 -> Atlanta to Savannah is equal to Triangle 1, side 2.

        // Triangle 2, side 2 -> Savannah to Orlando
        double t2s2 = radius * Math.acos(Math.sin(sx) * Math.sin(ox) + Math.cos(sx) * Math.cos(ox) * Math.cos(sy - oy));
        // Triangle 2, side 3 -> Atlanta to Orlando
        double t2s3 = radius * Math.acos(Math.sin(ax) * Math.sin(ox) + Math.cos(ax) * Math.cos(ox) * Math.cos(ay - oy));

        /*
        Now that the sides are determined, It's time to calculate the area of both triangles.

        s = (side1 + side2 + side3) / 2

        area = SqrRt( s *(s - side1)(s - side2)(s - side3) )
        */

        double t1s = (t1s1 + t1s2 + t1s3) / 2;
        double t1Area = Math.sqrt( t1s * (t1s - t1s1) * (t1s - t1s2) * (t1s - t1s3));

        double t2s = (t1s2 + t2s2 + t2s3) / 2;
        double t2Area = Math.sqrt( t2s * (t2s - t1s2) * (t2s - t2s2) * (t2s - t2s3));

        double totalArea = t1Area + t2Area;

        System.out.println("The total area enclosed between the Charlotte, Atlanta, Savannah, and Orlando is " + totalArea + " kilometers.");
    }
}
