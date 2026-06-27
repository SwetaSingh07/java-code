//Write A Program to check if the given string is a Palindrome?

package assignment.module1;

public class Assignment_131 
{

	public static void main(String[] args) 
	
	{
		String s="Madam";
		String reverse ="";
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
			char c=s.charAt(i);
			reverse=reverse+c;
		//	System.out.println(reverse);
		}
		
		System.out.println(reverse);
		
		if (reverse.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	
	}
	
	

}
