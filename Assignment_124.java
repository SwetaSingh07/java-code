//Write A Program on Interface with 2 Abstract methods

package assignment.module1;

abstract class Meth
{
	abstract void show();
	abstract void display();
}

public class Assignment_124 extends Meth
{

	public static void main(String[] args) 
	{
		Assignment_124 obj=new Assignment_124();
		obj.show();
		obj.display();
	}

	@Override
	void show() {
		
		System.out.println("This is Abstract method 1");
		
		
	}

	@Override
	void display() {

		System.out.println("This is Abstract method 2");
		
	}

}
