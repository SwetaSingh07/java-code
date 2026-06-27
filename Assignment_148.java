//Write a program to check if the given string starts with 'a' string"axe"
package assignment.module1;

public class Assignment_148 {

	public static void main(String[] args) {
		String s="axe";
		//boolean b=s.matches("a(.*)");  //this is also correct way of doing it
		boolean b=s.startsWith("a");
		if(b==true)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		

	}

}
