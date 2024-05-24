/*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/
package PracticeSet;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float f = sc.nextFloat();
        float c = (f-32f)*(5f/9f);
        System.out.println("Temperature in Celsius will be: " + c);
    }
}
