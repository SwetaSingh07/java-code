//Write A Program for static and non static global varibles and utilize them in both static and non static methods
package assignment.module1;

public class Assignment_37 {

	int a=10;      //Instance  Global variable 
	int b=20;      //Instance Global variable 
	static int d=80;     //Static  Global variable 
	static int e=10;     //Static  Global variable 
	void add()     //Non static method
	{
		System.out.println("Sum :"+(a+b)); // Utilising Instance global variable inside Non-static method directly by its name
	}
	static void sub()     //Static method
	{
		System.out.println("Sum :"+(d-e)); // Utilising Static global variable inside Non-static method directly by its name
	}
	
	
	public static void main(String[] args) {
		
		Assignment_37 z=new Assignment_37();
		z.add();           //calling non static method
		sub();             //calling  static method
	   

	}

}
