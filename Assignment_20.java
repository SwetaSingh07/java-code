// Write a Program to call 3 parameterized static Method Overloading
package assignment.module1;

public class Assignment_20 {
	
	static void add(int a)      //method 1 with one parameter
	{
		System.out.println("Printing number :"+a);
	}

	static void add(int a, int b)    //method 2 with two parameters having same name as method 1
	{
		System.out.println("Addition :"+ (a+b));
	}
	static void add(int a, int b,int c)    //method 3 with three parameters having same name as method 1 and 2
	{
		System.out.println("Addition :"+ (a+b+c));
	}
	public static void main(String[] args) {
	add(5,25);       // calling method 2
	add(100);        // calling method 1
	add(12,10,50);   // calling method 3

	}

}
