//Write a program to call 3 static parameterized methods  inside main method

package assignment.module1;

public class Assignment_04 {
	
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

	public static void main(String[] args) {
		add(5,15);
		sub(20,10);
		mult(12,8);

	}

}
