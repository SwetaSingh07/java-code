//Write a program for constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation

package assignment.module1;

class A1
{
	 A1(int a)
	{                                           
		
		 System.out.println("This is Grandparent parameterized constructor");
	}
}
class B1 extends A1
{
	B1(double b)
	
	{
		super(10);                         //explicitly adding super calling  statement
		System.out.println("This is Parent parameterized constructor");
	}
}
class C1 extends B1
{
	C1(String c)
	{
	    
	    super(5.5);                           //explicitly adding super calling  statement
		System.out.println("This is Child parameterized constructor");
	}
}


public class Assignment_85 {

	public static void main(String[] args) 
	{
		new C1("Sweta");

	}

}
