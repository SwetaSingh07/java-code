//Write a program for constructor inheritance- multi level using a non parameterized super calling statement with implicit invocation

package assignment.module1;

class Amazon
{
	 Amazon()
	{                                           //super calling is presnt as first line implicitly
		System.out.println("This is Grandparent constructor");
	}
}
class Flipkart extends Amazon
{
	 Flipkart()
	{
		System.out.println("This is Parent constructor");
	}
}
class Myntra extends Flipkart
{
	Myntra()
	{
		System.out.println("This is Child constructor");
	}
}

public class Assignment_84 
{

	public static void main(String[] args)
	{
		Myntra m=new Myntra();
		

	}

}
