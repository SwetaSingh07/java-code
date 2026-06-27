//Write a program to Check if the given strig consist of exact 3 letters string"axe"

package assignment.module1;

public class Assignment_147 {

	public static void main(String[] args)
	{
		String s="axe";
		if(s.matches("[a-zA-Z]{3}"))
		{
			System.out.println("Yes , given string has 3 characters");
		}
		else
		{
			System.out.println("No , given string does not have 3 characters");
		}
		

	}

}
