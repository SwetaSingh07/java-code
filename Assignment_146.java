//Write A Program to check if String is Anagram
package assignment.module1;

import java.util.Arrays;

public class Assignment_146 {

	public static void main(String[] args) 
	{
		String s="was";
	   String p="saw";
	
	if(s.length()!=p.length())
	{
		System.out.println("This cannot be an anagram");
	}
	else
	{
		char[] c1=s.toCharArray();      //will convert String to array like [w,a,s]
		char[] c2=p.toCharArray();      //will convert String to array like [s,a,w]
		
		Arrays.sort(c1);             //will sort arrays in alphabetical order like [a,s,w]  
		Arrays.sort(c2);             //will sort arrays in alphabetical order like [a,s,w] 
		
		if(Arrays.equals(c1,c2))
		{
			System.out.println("String is anagram");
		
		}
		
		else
		{
			System.out.println("String is not an  anagram");
		}
	}

}

}
