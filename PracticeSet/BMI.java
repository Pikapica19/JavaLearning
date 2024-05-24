/*Write a Java program to compute the body mass index (BMI).
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
*/

package PracticeSet;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your weight in pounds:");
        float weight = sc.nextFloat();
        System.out.println("Enter your height in inches:");
        float height = sc.nextFloat();
        float bmi = 703f*(weight/(height*height));
        System.out.println("Your BMI is: " + bmi);
    }
}
