//Write a program to store student name along with their roll no and print them in readable format

package assignment.module1;

import java.util.Scanner;

public class Assignment_135 
{

	
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of students");
    int size = sc.nextInt();

    String student[] = new String[size];
    int roll[] = new int[size];

    sc.nextLine(); // clear buffer

    // Input
    for(int i = 0; i < size; i++)
    {
        System.out.println("Enter name of student");
        student[i] = sc.nextLine();

        System.out.println("Enter Roll no. of student");
        roll[i] = sc.nextInt();

        sc.nextLine(); // clear buffer
    }

    // Output
    System.out.println("\nStudent Details");

    for(int i = 0; i < size; i++)
    {
        System.out.println("Name : " + student[i] +
                           "  Roll No : " + roll[i]);
    }

    sc.close();
}
}