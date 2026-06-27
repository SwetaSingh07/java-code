//Write a program to create a  Non-Static Method and call it inside main method
package assignment.module1;

public class Assignment_12 {
	
	void product(int a, int b) //Non-Static or Instance method
	{
		int c=a*b;
		System.out.println("Product of two numbers are :" +c);
	}

	public static void main(String[] args) {
		Assignment_12 p=new Assignment_12(); //Creatigng object inside main method to call non static method
		p.product(8, 9);   // calling non static method with the help of reference variable

	}

}
