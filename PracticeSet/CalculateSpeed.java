/*Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
*/
package PracticeSet;

import java.util.Scanner;
public class CalculateSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in meters:");
        float distance = sc.nextFloat();
        System.out.println("Enter the time in hour");
        float hour = sc.nextFloat();
        System.out.println("Enter the time in minutes");
        float min = sc.nextFloat();
        System.out.println("Enter the time in seconds");
        float sec = sc.nextFloat();

        float timeSeconds = (hour*3600f)+(min*60f)+sec;
        float speed = distance/timeSeconds;
        System.out.println("The speed in meters/seconds: " + speed);
        float speed1 = (distance/1000f)/(timeSeconds/3600f);
        System.out.println("The speed in kilometer/hour: " + speed1);
        float speed2 = speed1/1.609f;
        System.out.println("The speed in miles/hour: " + speed2);
    }
}
