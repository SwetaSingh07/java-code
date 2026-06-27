//Write a program on both method Overloading and consturctor overloading
package assignment.module1;

public class Assignment_29 {
	  
	Assignment_29()    //Constructor 1 with no parameter
	{
		System.out.println("Constructor 1");
	}
	Assignment_29(int a)       //Constructor 2 with  parameter
	{
		System.out.println("Constructor 2");
	}
	
	static void add()               //Method 1 with  no parameter
	{
		System.out.println("Method 1");
	}
	static void add(int a)                   //Method 2 with parameter
	{
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		
		new Assignment_29();
		new Assignment_29(6);
		
		add();
		add(8);

	}

}
