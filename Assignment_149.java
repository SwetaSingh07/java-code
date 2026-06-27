//Write a program to Check if the given string ends with 'e'  string"axe"

package assignment.module1;

public class Assignment_149 {

	public static void main(String[] args) 
	{
		String s="axe";
		
		boolean c=s.matches("(.*)e");
		//boolean c=s.endsWith("e");  //this is also correct way of doing it
		if(c)
		{
			System.out.println("Yes, it ends with e");
		}
		
		else
			System.out.println("No, it does not ends with e");
			
	}

}
