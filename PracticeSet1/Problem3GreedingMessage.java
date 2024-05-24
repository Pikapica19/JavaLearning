//Write a Java Program which asks user to enter their name and greet's
//them with "Hello <name>, have a great day" text
package PracticeSet1;

import java.util.Scanner;

public class Problem3GreedingMessage {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");
        sc.close();
    }
}
