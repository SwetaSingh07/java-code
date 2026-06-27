//Write a program to check whether a number is  even or odd using run time input and if else block

package assignment.module1;

import java.util.Scanner;

public class Assignment_51 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        
		 System.out.println("Enter a number:");
	        int num = sc.nextInt();   // run time input
	        
	        if(num % 2 == 0) {
	            System.out.println("The number is Even");
	        } 
	        else {
	            System.out.println("The number is Odd");
	        }

	        sc.close();
	    }
	}
