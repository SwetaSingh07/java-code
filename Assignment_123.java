//Write A Program on Abstract Class with both Abstract and Concrete methods

package assignment.module1;

abstract class DemoAbstract
{
	abstract void demo();  //abstract method
	
	void conc()
	{
		System.out.println("This is Concrete method");
	}
}

public class Assignment_123 extends DemoAbstract
{
	void meth()
	{
		System.out.println("This is child class method");
		
	}

	public static void main(String[] args) 
	
	{
		
		Assignment_123 obj=new Assignment_123();
		obj.meth();
		obj.conc();
		obj.demo();
	}

	@Override
	void demo() 
	{
		System.out.println("This is the implemetation of abstract method");
		
	}

}
