//Write a program to check whether a number is  between 10 and 50 using scanner class to accept run time input
package assignment.module1;

import java.util.Scanner;

public class Assignment_57 {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the number");
     int num=sc.nextInt();
     
     if(num>10 && num<50)
     {
     System.out.println("Number is within the range");
     }
     else
     {
    	 System.out.println("Number is outside the range"); 
     }
     sc.close();
	}
	

}
