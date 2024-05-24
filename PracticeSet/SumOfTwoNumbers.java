// Write a Java program to print the sum of two numbers.
package PracticeSet;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of two number is " + c);
    }
}
