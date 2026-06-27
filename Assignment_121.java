//Write A Program to avoid Method Overiding using Final Method

package assignment.module1;

class NonOverriden
{

	 final void show()
	{
		System.out.println("This is the Parent method");
	}
}

public class Assignment_121 extends NonOverriden
{
	
	void show()   //Cannot override the final method from NonOverriden
	{
		System.out.println("This is the Child method");
	}

	public static void main(String[] args) 
	{
		
		Assignment_121 obj=new Assignment_121();
		obj.show();
	}

}
