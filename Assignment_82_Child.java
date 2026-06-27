//Write a program for constructor inheritance using the super calling statement with Implicit Invocation

package assignment.module1;

public class Assignment_82_Child extends Assignment_82_Parent   //child class inheriting parent class
{

	Assignment_82_Child()      //child class constructor
	{
		//super calling statement is present as first line of the constructor implicitly
		System.out.println("Child Class Non Parameterized constructor");
	}
	public static void main(String[] args)
	{
		
     new Assignment_82_Child();  //created object for child constructor
	}

}
