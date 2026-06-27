//Write a program to create static methods along with a main method that performs addition, subtraction, multiplication,division and mode

package assignment.module1;

public class Assignment_07 {
	
	static void add()
	{
		int a=10;
		int b=20;
		System.out.println("Sum: "+(a+b));
	}
	static void sub()
	{
		int a=10;
		int b=20;
		System.out.println("Sum: "+(a-b));
	}
	static void mult()
	{
		int a=10;
		int b=20;
		System.out.println("Sum: "+(a*b));
	}
	static void div()
	{
		int a=40;
		int b=20;
		System.out.println("Sum: "+(a/b));
	}
	static void mod()
	{
		int a=10;
		int b=20;
		System.out.println("Sum: "+(b%a));
	}

	public static void main(String[] args) {
		
		add();
		sub();
		mult();
		div();
		mod();
	}

}
