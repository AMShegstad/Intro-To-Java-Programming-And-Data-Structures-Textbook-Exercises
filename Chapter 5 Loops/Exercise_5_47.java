/*
 * (Business: check ISBN-13)
 * 
 * ISBN-13 is anew standard for identifying books. It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last
 * digit d13 is a checksum, which is calculated from the other digits using the following formula:
 * 
 *      10 - (d1 + (3 * d2) + d3 + (3 * d4) + d5 + (3 * d6) + d7 + (3 * d8) + d9 + (3 * d10) + d11 + (3 * d12)) % 10
 * 
 * If the checksum is 10, replace it with 0. Your program should read the inpuy as a string. Display "invalid input"
 * if the input it invalid. Here are sample runs:
 * 
 *      Enter the first 12 digits of an ISBN-13 as a string: 978013213080
 *      The ISBN-13 number is 9780132130806
 * 
 *      Enter the first 12 digits of an ISBN-13 as a string: 978013213079
 *      The ISBN-13 number is 9780132130790
 * 
 *      Enter the first 12 digits of an ISBN-13 as a string: 97801320
 *      97801320 is an invalid input
 */

public class Exercise_5_47 {
    
}
