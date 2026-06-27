//Write a Program to Check Day of the Week using scanner class in switch concept


package assignment.module1;

import java.util.Scanner;

public class Assignment_63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of day : ");
		int day=sc.nextInt();
		
		switch (day)
		{
		case 1:
			System.out.println("Day is Monday");
			break;
			
		case 2:
				System.out.println("Day is Tuesday");
				break;
				
		case 3:
				System.out.println("Day is Wednesday");
				break;
		case 4:
			System.out.println("Day is Thursday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		case 7:
			System.out.println("Day is Sunday");
			break;
			
			default:
				System.out.println("Invalid");
		
		}
		
		sc.close();

	}

}
