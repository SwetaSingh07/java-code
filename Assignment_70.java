/*Write a program using nested if and scanner class 
a. Check if marks are valid (0–100)
b. marks above 90 then check math and science should above 90 then A+ 
c. marks above 90 then check if math and science below 90 then A
d. marks above 80 and below 90 then check math and science should above 90 then B+
e. marks above 80 and below 90 then check if math and science below 90 then B */

package assignment.module1;

import java.util.Scanner;

public class Assignment_70 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter overall marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Science marks: ");
        int science = sc.nextInt();

        // Step 1: Validate marks
        if (marks >= 0 && marks <= 100 &&
            math >= 0 && math <= 100 &&
            science >= 0 && science <= 100) {

            // Step 2: Apply grading logic
            if (marks > 90) {
                if (math > 90 && science > 90) {
                    System.out.println("Grade: A+");
                } else {
                    System.out.println("Grade: A");
                }
            } 
            else if (marks > 80 && marks <= 90) {
                if (math > 90 && science > 90) {
                    System.out.println("Grade: B+");
                } else {
                    System.out.println("Grade: B");
                }
            } 
            else {
                System.out.println("Grade not defined for marks below or equal to 80");
            }

        } else {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        }

        sc.close();
    }
}
