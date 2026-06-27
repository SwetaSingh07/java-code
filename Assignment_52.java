//Write a program to check whether a character is a vowel or consonant must use if else block and scanner class
package assignment.module1;

import java.util.Scanner;

public class Assignment_52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0); //chatAt(0) takes single character from user.
		
		if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Character is a vowel");
		}
		else
		{
			System.out.println("Character is a consonant");
		}
		
		sc.close();
	}

}
