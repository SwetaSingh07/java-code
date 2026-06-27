//Write a program to create relationship between class and abstract class , abstract class and interface(Multi level inheritence)


package assignment.module1;

interface SuperParent
{
	void add();
}

abstract class SubParent implements  SuperParent
{
	abstract void sub();
}

	

public class Assignment_126 extends SubParent
{

	public static void main(String[] args)
	{
		Assignment_126 obj=new Assignment_126();
		obj.add();
		obj.sub();

	}

	@Override
	public void add() {
		System.out.println("This is Logic 1");
		
	}

	@Override
	void sub() {
		System.out.println("This is Logic 2");
		
	}

}
