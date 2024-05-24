/*Write a Java program that reads a number and displays the square, cube, and fourth power.
Expected Output:
Square: .2f
Cube: .2f
Fourth power: 50625.00*/
package PracticeSet;

import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = sc.nextDouble();
        double square = num*num;
        System.out.println("Square of the number is: " + square);
        double cube = square*num;
        System.out.println("Cube of the number is: " + cube);
        double fourthPower = cube*num;
        System.out.println("The fourth power is: " + fourthPower);
    }
}
