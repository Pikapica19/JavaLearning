/*Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
*/
package PracticeSet;

import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:" );
        int num1 = sc.nextInt();
        System.out.println("Enter second integer:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two integers is: " + sum);
        int difference = num1-num2;
        System.out.println("The difference of two integers is: " + difference);
        int mul = num1 * num2;
        System.out.println("The product of two integers is: " + mul);
        float avg = sum/2f;
        System.out.println("The average of two integers is: " + avg);
        if(num1>num2){
            System.out.println("The max integer is: " + num1);
        }else{
            System.out.println("The min integer is: " + num1);
        }
        if(num1<num2){
            System.out.println("The max integer is: " + num2);
        }else{
            System.out.println("The min integer is: " + num2);

        }
    }
}
