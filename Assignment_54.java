//Write a program to check whether a person is  eligible for a senior citizen discount by accepting run time input(age ≥ 60)
 
package assignment.module1;

import java.util.Scanner;

public class Assignment_54 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if(age>=60) 
		{
		System.out.println("Senior citizen elligible for discount");
			
		}
		else
		{
		System.out.println("No discount");	
		}
		sc.close();
	}

}
