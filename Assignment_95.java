//Write a program for constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation

package assignment.module1;

class Fruit
{
	Fruit()
	{
		System.out.println("GrandParent Constructor");
	}
}

class Berries extends Fruit
{
	Berries(String s)
	{
		super();
		System.out.println("Parent Constructor");
	}
}
class Seed extends Berries
{
	Seed(String a , String x)
	{
		super("Grapes");
		System.out.println("Child Constructor");
	}
}
public class Assignment_95 {

	public static void main(String[] args) {
		Seed obj=new Seed("Melon","Chia");

	}

}
