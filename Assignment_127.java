/* Write a program with different string function mentioned below
 
 Length
 tolowercase
 touppercase
 trim
 charAt(index)
 indexof(char)
 substring(start index)
 substring(start index, end index)
 equals
 contains
 equalsIgnoreCase   */

package assignment.module1;

public class Assignment_127 
{
	static void StringFunction()
	{
	String s =" Automation Testing ";
	String s2="Manual Testing";
	String s3="manual testing";
	
	System.out.println(s.length());
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	System.out.println(s.charAt(5));
	System.out.println(s.indexOf('T'));
	System.out.println(s.substring(4));
	System.out.println(s.substring(2,6));
	System.out.println(s.equals(s2));
	System.out.println(s.contains("testing"));
	System.out.println(s2.equalsIgnoreCase(s3));
	
	
	
	}

	public static void main(String[] args)
	{
		StringFunction();

	}

}
