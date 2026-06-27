//Write a Program on This Calling Statement on single level inheritance

package assignment.module1;

class app
{
	app()
	{
		System.out.println("This is parent Non Paramterized constructor");
	}
	app(int x)
	{
		System.out.println("This is parent Paramterized constructor");
	}
}
class Web extends app
{
	Web()
	{
		this("Google");     //this calls the constructor of same class
		System.out.println("This is Child Non Paramterized constructor");
	}
	Web(String s)
	{
		System.out.println("This is Child  Paramterized constructor");
	}
	
}

public class Assignment_86 {

	public static void main(String[] args)
	{
		new Web();
	}

}
