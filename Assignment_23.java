//Write a Program to call combination of static and non static non parameterized method overloading
package assignment.module1;

public class Assignment_23 {
	
	static void sub(int a , int b)    //static method with 2 parameters
	{
		
		System.out.println("Subtraction of nos: "+(a-b));
	}
	void sub()     //non-static method with NO parameter that has same name as static method
	{
		int a=20;
		int b=10;
		System.out.println("Addition of nos: "+(a-b));
	}

	public static void main(String[] args) {
		sub(70,20);                       //calling static method directly by its name
		Assignment_23 a=new Assignment_23();    //creating object to call Non static method
		a.sub();                             //calling non static non parameterised method
	}

}
