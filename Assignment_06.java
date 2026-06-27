//Write a program to performs addition, subtraction, multiplication, division and mode

package assignment.module1;

public class Assignment_06 {
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	static void sub(double d,int e)
	{
		double f=d-e;
		System.out.println(f);
		
	}
	static void mult(float g,int h)
	{
		float i=g*h;
		System.out.println(i);
	}
	static void div(int j,int k)
	{
		int l=j*k;
		System.out.println(l);
	}

	public static void main(String[] args)
	{
		add(30,85);
		sub(95.56,20);
		mult(20,5);//here 20 was a float datatype which has been passed without decimal but gave result in decimal form
		div(100,10);
	}

}
