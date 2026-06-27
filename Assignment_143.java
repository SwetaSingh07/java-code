//Write A Program to count the number of alphabets are present in the String

package assignment.module1;

public class Assignment_143 {

	public static void main(String[] args)
	{
		String s="Sweta123";
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		
		
		if(Character.isAlphabetic(c))
		{
			count++;
		}
		}
		
		System.out.println("Total alphabets in given string is :"+count);

	}


}
