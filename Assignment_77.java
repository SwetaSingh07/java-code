	//Write a program for single-level inheritance using a static and Non-static method in the different class name in the single package explorer.

package assignment.module1;

class Methods
{
	public static void add()
	{
		int a=10;
		int b=20;
		System.out.println("Sum : "+(a+b));
	}
	
	public void sub()
	{
		int a=50;
		int b=20;
		System.out.println("Difference : "+(a-b));
	}
}



public class Assignment_77  extends Methods
{

	public static void main(String[] args) 
	
	{
		Methods obj=new Methods();
		add();
		obj.sub();

	}

}
