//Write A Program to accept the array input at run time

package assignment.module1;

import java.util.Scanner;

public class Assignment_133 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array Size");
		int a=sc.nextInt();
		
		int arr[]=new int[a]; //declaring array
		
		System.out.println("Enter the Array Elements");
		
		for (int i=0;i<=arr.length-1;i++) //loop to take input from user
		{
			arr[i]=sc.nextInt();
			
		}

		System.out.println("The Array Elements are :"); //loop to display
		
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
