/*Write a Java program to convert minutes into years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days*/
package PracticeSet;

import java.util.Scanner;
public class ConvertMinuteInYears {
    public static void main(String[] args) {
      double minutesInYear = 60*24*365;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter minutes");
        double minutes = sc.nextInt();
        long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes / 60 / 24) % 365;
        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
