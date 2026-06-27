/*Write a program to calculate electricity bill:
 If units ≤ 100 → ₹5/unit
 If units > 100 → ₹10/unit
must use scanner class to accept run time input*/

package assignment.module1;

import java.util.Scanner;

public class Assignment_60 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the unit");
		int a=sc.nextInt();
		
		if(a<=100)
		{
			System.out.println("Total amount to be paid is :"+(5*a));
		}
		else
			
		{
			System.out.println("Total amount to be paid is :"+(10*a));
		}
		sc.close();
	}

}
