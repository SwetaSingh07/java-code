//Write a program to calculate simple interest  and check if it is greater than 1000 must use math class and scanner class
package assignment.module1;

import java.util.Scanner;

public class Assignment_53 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		Double p=sc.nextDouble();
		
		System.out.println("Enter the rate");
		Double r=sc.nextDouble();
		
		System.out.println("Enter the time");
		Double t=sc.nextDouble();
		
		Double interest=(p*r*t)/100;
		System.out.println("The interest is :"+interest);
		
		
		
		if(interest>1000)
		{
			System.out.println("The round Off of the interest is :"+Math.round(interest));
		}
		
		sc.close();

	}

}
