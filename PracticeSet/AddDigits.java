/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
*/
package PracticeSet;
import java.util.Scanner;
public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 1000");
        int num = sc.nextInt();
        int temp = 0;
        int a = 0;
        for(int i=0; i<=3; i++){
            temp = num%10;
            a = a+temp;
            num = num/10;
        }
        System.out.println("Sum of digits will be: " + a);
    }
}
