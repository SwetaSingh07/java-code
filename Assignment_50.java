/*Write a Program to check person can vote only if he/she is 18 or above and should not vote if age is less using run
time input */

package assignment.module1;

import java.util.Scanner;

public class Assignment_50 {
	
    
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can't vote");
		}
			
        sc.close();
	}

}
