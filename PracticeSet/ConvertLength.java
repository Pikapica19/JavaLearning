/*. Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
*/
package PracticeSet;

import java.util.Scanner;
public class ConvertLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in Inches:");
        float inch = sc.nextFloat();
        float miles = inch / 63360f;
        System.out.println("The in Miles will be: " + miles);
    }
}
