//Write a program to check whether a year is a  century year (divisible by 100) by accepting run time input
package assignment.module1;

import java.util.Scanner;

public class Assignment_55 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year=sc.nextInt();
		
		if(year % 100 == 0)
		{
			System.out.println("Century year");	
		}
		else
		{
			System.out.println("Not a Century year");	
		}
			
      sc.close();
	}

}
