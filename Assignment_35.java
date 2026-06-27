//Write A Program to declare a vairable inside a static and non static Method. For global varable
package assignment.module1;

public class Assignment_35 {

	int a=10;      //Instance  Global variable 
	int b=20;      //Instance Global variable 
	int d=80;     //Instance Global variable 
	static int e=10;   //static Global variable
	static int f=5;    //static Global variable
	void add()     //Non static method
	{
		System.out.println("Sum :"+(a+b)); //Instance global variable a and b can be accessed inside Non-static method directly by its name
	}
	static void sub()
	{
		System.out.println("Sub :"+(e-f));  //static Global variable can be accessed directly inside static method
	}
	public static void main(String[] args) {
		
		Assignment_35 z=new Assignment_35();  //creating object to call non static method by it's refernce variable
		z.add();
		
	   System.out.println(z.d);  //utilising global variable d inside a static method by object and refernce variable
		
	   sub();  //calling static method directly by it's name

	}
}
