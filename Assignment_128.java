//Write a program for Reverse a String by using String Functions


package assignment.module1;

public class Assignment_128 
{
	
	static void  ReverseString()
	{
		String s="Sweta Singh";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			reverse =reverse+c;
			
			
			
		}
		System.out.println(reverse);
		
		
	}

	public static void main(String[] args) 
	{
		
		ReverseString();
	}

}
