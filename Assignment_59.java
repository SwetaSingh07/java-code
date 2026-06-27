//Write a program to find the  largest of two numbers using scanner class

package assignment.module1;

import java.util.Scanner;

public class Assignment_59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int a=sc.nextInt();
		
		System.out.println("Enter your second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is largest number");
		}
		else
		{
			System.out.println("B is largest number");
		}
		
		sc.close();
		
	}

}
