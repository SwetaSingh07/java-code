//Write A Program on Abstract Class and Abstract Method

package assignment.module1;

abstract class AbstractDemo
{
	abstract void display();
}

public class Assignment_122 extends AbstractDemo
{
	static void show()
	{
		System.out.println("This is concrete method");
	}

	public static void main(String[] args)
	{
		Assignment_122 obj=new Assignment_122();
		show();
		obj.display();
		
	}

	@Override
	void display()
	{
		System.out.println("THis is place where actual logic is written");
		
	}

}
