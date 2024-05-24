//Write a Java program to detect whether a number enter by user is integer or not
package PracticeSet1;

import java.util.Scanner;

public class Problem5CheckInteger {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
