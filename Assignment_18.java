//Write a Program to call a parameterized non static method present inside your own class
package assignment.module1;

public class Assignment_18 {
	
	void add(int a, int b)      //parameterized non static method
	{
		int c=a+b;
		System.out.println("Sum of two nos.:"+c);
	}

	public static void main(String[] args) {
		Assignment_18 k =new Assignment_18(); //creating object to call parameterized non static method
		k.add(65, 10);       //Calling with the help of reference variable

	}

}
