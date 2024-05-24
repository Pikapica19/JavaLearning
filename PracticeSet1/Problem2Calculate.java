//Write a program to calculate the CGPA using marks of three subjects.

package PracticeSet1;
import java.util.Scanner;

public class Problem2Calculate {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of Maths");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of Science");
        float c = sc.nextFloat();
        float cgpa = (a+b+c)/30;
        System.out.println("The CGPA for three subject is " + cgpa);
        sc.close();
    }
}
