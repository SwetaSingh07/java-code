//Write a program for constructor inheritance using the super calling statement with Explicit Invocation

package assignment.module1;

class Nano
{
	Nano(int a, int b)
	{
		System.out.println("GrandParent :"+(a+b));
	}
}

class Vita extends Nano
{
	Vita(int a, int b,int c)
	{
		super(7,5);
		System.out.println("Parent :"+(a+b+c));
	}
}
class Gama extends Vita
{
	Gama(double a, double b)
	{
		super(10,3,4);
		System.out.println("Child :"+(a+b));
	}
}
public class Assignment_94 {

	public static void main(String[] args) {
		Gama obj=new Gama(5.5,2.2);

	}

}
