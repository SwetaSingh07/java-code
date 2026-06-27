//Write A Program on String Function using toCharArray concept

package assignment.module1;

public class Assignment_132 
{

	public static void main(String[] args) 
	{
		String s="Sweta";
		
		char[] c=s.toCharArray(); //Converted String to array
		//System.out.println(c[]);
		
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}

	}

}
