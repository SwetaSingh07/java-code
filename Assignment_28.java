//Write a Program to call  parameterized Constructor Overloading

package assignment.module1;

public class Assignment_28 {
	
	Assignment_28(int a,int b)
	{
		System.out.println("Constructor 1");
	}
	Assignment_28(int a)
	{
		System.out.println("Constructor 2");
	}
	Assignment_28(int a, double c)
	{
		System.out.println("Constructor 3");
	}

	public static void main(String[] args) {
		
		new Assignment_28(2,3);
		new Assignment_28(7);
		new Assignment_28(5,10.0);
	}

}
