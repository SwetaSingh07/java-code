// Write a program to create 3 Non-Static Methods and call them in main method with a single reference variable
package assignment.module1;

public class Assignment_14 {

	void product(int a, int b) //Non-Static parameterized  method 1
	{
		int c=a*b;
		System.out.println("Product of two numbers are :" +c);
	}
	void div()             //Non-Static non parameterized method 2
	{
		int a=25;
		int b=5;
		int c=a/b;
		System.out.println("Division of two numbers are :" +c);
	}
	void pow()             //Non-Static non parameterized method 3
	{
		double a=5;
		double c=Math.pow(a, 2);
		System.out.println("Division of two numbers are :" +c);
	}

	public static void main(String[] args) {
		Assignment_14 p=new Assignment_14(); //Creatigng object inside main method to call non static method
		p.product(3, 9);   // calling non static method 1 with the help of reference variable
		p.div();           // calling non static method 2 with the help of reference variable
		p.pow();          // calling non static method 3 with the help of reference variable

	}

	
}
