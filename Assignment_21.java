//Write a Program to call 3 parameterized non static Method Overloading
package assignment.module1;

public class Assignment_21 {
	
	void mult(int a, int b)   //parameterized non static Method 1
	{
		System.out.println("Multiplying method 1 :"+(a*b));
	}
	void mult(int a, int b , int c)    //parameterized non static Method 2 with same name as Method 1
	{
		System.out.println("Multiplying method 2 :"+(a*b*c));
	}
	void mult(double a, int b )    //parameterized non static Method 3 with same name as Method 1 and 2 but variation in args
	{
		System.out.println("Multiplying method 2 :"+(a*b));
	}

	public static void main(String[] args) {
		Assignment_21  m=new Assignment_21 ();  //creatinf object to call  parameterized non static Method
		m.mult(5, 8);                  //calling method 1
		m.mult(5, 8, 5);                //calling method 2
		m.mult(2.5, 2);                 //calling method 3

	}

}
