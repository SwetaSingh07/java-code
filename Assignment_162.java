//Write a program to Check whether two strings are anagrams using sort and equals in Java

package assignment.module1;

import java.util.Arrays;

public class Assignment_162 {

	public static void main(String[] args) 
	{
		String a="listen";
		String b="silent";
		
		char d[]=a.toCharArray();
		char e[]=b.toCharArray();
		
		Arrays.sort(d);
		Arrays.sort(e);
		
		if(Arrays.equals(d, e))
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is Not an Anagram");
		}
	}

}
