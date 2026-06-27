//Write A Program on super calling statement using parameterized super calling statement

package assignment.module1;
class P1
{
	P1(int a, int b )
	{
		System.out.println("Sum :"+(a+b));
	}
}
class P2 extends P1
{
	P2(float c, float d )
	{
		super(10,5);       // parameterized super calling statement
		System.out.println("Diff :"+(c-d));
	}
}

public class Assignment_89 {

	public static void main(String[] args)
	{
		P2 p=new P2(5.3f,3.3f);
	}

}
