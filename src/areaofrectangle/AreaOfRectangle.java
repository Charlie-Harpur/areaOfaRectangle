/*
 * Charlie Harpur
 * Calculates and prints the length, width, and area of a rectange
 * 28/02/2018
 */

package areaofrectangle;


public class AreaOfRectangle
{
    public static void main(String[] args)
    {
        double length =  5.7, width = 4.8, areaOfRectangle;
        areaOfRectangle = length * width;
        System.out.print ("length = " + length + "cm"
        + "\nWidth = " + width + "cm"
        + "\nArea = " + areaOfRectangle + "cm squared.");
    }
}
