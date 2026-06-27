//Write a program for constructor inheritance using the super calling statement with Implicit Invocation

package assignment.module1;

class Xyllo
{
	Xyllo()
	{
	
		System.out.println("This is Grand Parent Constructor");
	}
}

class Mini extends Xyllo
{
	Mini()
	{
		//super calling statement is present impicitly
		System.out.println("This is Parent Constructor");
	}
}
class Nick extends Mini
{
	Nick()
	{
		//super calling statement is present impicitly
		System.out.println("This is Child Constructor");
	}
}

public class Assignment_93 {

	public static void main(String[] args) 
	{
		new Nick();   //creating object of Child constructor which will call its parent constructor that will also call it's own Parent constructor

	}

}
