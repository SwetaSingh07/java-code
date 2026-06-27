//Write a program to check does the String contain Cart in it?   String is "testing"

package assignment.module1;

public class Assignment_153 
{

	public static void main(String[] args) 
	{
		String s="testing";
		boolean b=s.contains("cart");
		
		if(b==true)
		{
			System.out.println("String contain Cart in it");
		}
		else
		{
			System.out.println("String does not contain Cart in it");
		}
	}

}
