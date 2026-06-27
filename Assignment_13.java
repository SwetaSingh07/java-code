// Write a program to create 3 non parameterized non static method and try calling them inside main method
package assignment.module1;

public class Assignment_13 {
	
	void add()     //non parameterized non static method 1
	{
		int a=5;
		int b=7;
		System.out.println("Addition :"+(a+b));
	}
	void sub()    //non parameterized non static method 2
	
	{
		int a=10;
		int b=5;
		System.out.println("Subtraction :" +(a-b));
	}

	void mult()    //non parameterized non static method 3
	{
		int a=8;
		int b=2;
		System.out.println("Multiplication :" +(a*b));
	}
	public static void main(String[] args) {
		Assignment_13 n=new Assignment_13(); // Creating an object 
		n.add();                             //Calling non parameterized non static method 1
		n.sub();							//Calling non parameterized non static method 2
		n.mult();                           //Calling non parameterized non static method 3

	}

}
