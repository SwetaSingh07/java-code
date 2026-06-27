//Write a program to Check Vowel or Consonant using scanner class in switch case concept

package assignment.module1;

import java.util.Scanner;

public class Assignment_64 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your alphabet");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'A':
		case 'E':
		case 'I':
		case 'O':	
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':	
		case 'u':
			
			System.out.println("It's a Vowel");
			break;

		
		default:
		
			System.out.println("It's a Consonant");
			
	}
		sc.close();
	}
}

	

