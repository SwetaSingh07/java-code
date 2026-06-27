//Write a Program on Constructor Chaining

package assignment.module1;

public class Assignment_96 
{
	Assignment_96()
	
	{
		 this(20.5);
		System.out.println("This is Constructor 1");
	}
	 Assignment_96(int a)
		{
		 
		 System.out.println("This is Constructor 2");
		}
	 Assignment_96(double b)
		{
		 this(45);
			System.out.println("This is Constructor 3");
		}

	public static void main(String[] args)
	{
		new Assignment_96();
		 

	}

}
