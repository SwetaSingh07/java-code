//Write a Program to reverse an array

package assignment.module1;

import java.lang.reflect.Array;

public class Assignment_138 
{

	public static void main(String[] args) 
	{
		//int arr[]= {10,20,30,40,50};   OR
		
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		System.out.println("Reverese array :");
		
		for(int i=num.length-1;i>=0;i--)
		
			System.out.println(num[i]);
		}

	}


