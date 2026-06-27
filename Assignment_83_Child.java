//Write a program for constructor - single level inheritance using a non-parameterized super calling statement with explicit invocation


package assignment.module1;

public class Assignment_83_Child extends  Assignment_83_Parent       //child class
{
	
	Assignment_83_Child()             //child class
	{
		super();
		System.out.println("This is my Non Parameterized Child class constructor");
	}

	public static void main(String[] args) {
		new Assignment_83_Child() ;

	}

}
