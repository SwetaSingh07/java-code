//Write a program to Check if the given string have the letter 'u' in it  string"manishtiwari"

package assignment.module1;

public class Assignment_150 {

	public static void main(String[] args) 
	{
		
		String s="manishtiwari";
		
		boolean b=s.contains("u");   //contains() will check this is present or not
		if(b)
		{
			System.out.println("Yes it contains u ");
		}
		else
			System.out.println("No it does not contains u ");
	}

}
