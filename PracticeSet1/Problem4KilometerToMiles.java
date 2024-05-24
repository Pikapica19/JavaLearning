//Write a Java program to convert Kilometers to Miles
package PracticeSet1;
import java.util.Scanner;

public class Problem4KilometerToMiles {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers");
        float km = sc.nextFloat();
        float miles = (float) (km/1.609);
        System.out.println("Miles " + miles);
        sc.close();
    }
}
