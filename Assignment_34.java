//Write A Program to declare a variable inside a static and non static Method for local variable
package assignment.module1;

public class Assignment_34 {

	void add(int a,int b) //local variable inside Non static method
	{
		System.out.println("Sum :"+(a+b));
	}
	public static void main(String[] args) {
		int d=80;     //local variable inside static method
		System.out.println(d);
		Assignment_34 z=new Assignment_34();
		z.add(10,20);

	}

}
