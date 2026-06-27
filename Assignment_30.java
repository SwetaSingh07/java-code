//Write a Program  to call Scanner class methods
package assignment.module1;

import java.util.Scanner;

public class Assignment_30 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=s.nextInt();
		
		System.out.println("Enter second number");
		int b=s.nextInt();
		
		int c=a+b;
		System.out.println("Sumof two numbers :"+c);
				
		s.close();
	}

}
