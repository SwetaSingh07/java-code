// Write a program to create  3 Non-Static non parameterized Methods and call them in main method with a single reference variable
package assignment.module1;

public class Assignment_15 {
	
	void sqrt() //Non-Static non parameterized  method 1
	{
		double a=49;
		System.out.println("Square root is :" + Math.sqrt(a));
	}
	void area()             //Non-Static non parameterized method 2
	{
		int l=7;
		int b=5;
		int c=l*b;
		System.out.println("Area of rectangle is :" +c);
	}
	void pow()             //Non-Static non parameterized method 3
	{
		double a=5;
		double c=Math.pow(a, 2);
		System.out.println("Division of two numbers are :" +c);
	}

	public static void main(String[] args) {
		Assignment_15 p=new Assignment_15(); //Creatigng object inside main method to call non static method
		p.sqrt();   // calling non static method 1 with the help of reference variable
		p.area();           // calling non static method 2 with the help of reference variable
		p.pow();          // calling non static method 3 with the help of reference variable

		

	}

}
