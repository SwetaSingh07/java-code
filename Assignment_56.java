//Write  a program with combination of for Loop and scanner class.
package assignment.module1;

import java.util.Scanner;

public class Assignment_56 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);   // runtime input 
		
		System.out.println("Enter the limit to which you want numbers to be printed :"); //this will set the condition for For loop
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
		
		
      sc.close();
	}

}
