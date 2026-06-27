//Write a Program to call combination of static and non static parameterized method overloading
package assignment.module1;

public class Assignment_22 {
	
	static void add(int a, int b)    //static method with 2 parameters
	{
		System.out.println("Addition of nos: "+(a+b));
	}
	void add(int a, int b,double c)     //non static method with 3 parameters that has same name as static method
	{
		System.out.println("Addition of nos: "+(a+b+c));
	}

	public static void main(String[] args) {
		add(10,20);                       //calling static method directly by its name
		Assignment_22 a=new Assignment_22();    //creating object to call Non static method
		a.add(10, 20, 30.5);                 //calling Non static method by its refernce variable
		

	}

}
