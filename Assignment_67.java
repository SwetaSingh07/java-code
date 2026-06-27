/* Write a program using nested if If salary > 50,000 → check years of experience If experience > 5 → give bonus Else → no bonus
use scanner class to accept run time input */

package assignment.module1;

import java.util.Scanner;

public class Assignment_67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double sal=sc.nextDouble();
		
		System.out.println("Enter your years of experience");
		int yrs=sc.nextInt();
		
		if(sal>50000)
		{
			
			if(yrs>5)
			{
			System.out.println("Bonus");	
			}
			else
			{
				System.out.println("No Bonus");	
				}
			
				}
		else
		{
			System.out.println("Not Applicable for Bonus");
		}
	
		sc.close();		

	}

}
