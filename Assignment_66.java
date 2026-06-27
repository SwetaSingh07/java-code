//Write a program to:Check if marks are valid (0–100) Then assign grade: A, B, C, or Fail using nested if and scanner class

package assignment.module1;

import java.util.Scanner;

public class Assignment_66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int m = sc.nextInt();

        if (m >= 0 && m <= 100)  // Valid marks check
        {
            if (m >= 70) {
                System.out.println("A Grade");
            } 
            else if (m >= 50) {   // 50–69
                System.out.println("B Grade");
            } 
            else if (m >= 35) {   // 35–49
                System.out.println("C Grade");
            } 
            else {
                System.out.println("Fail");
            }
        } 
        else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}