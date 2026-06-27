//Write a Program to call a parameterized static method present inside your own class
package assignment.module1;

public class Assignment_16 {
	
	static void add(int a, int b, int c)     //parameterized static method
	{
	System.out.println("Addition :"+(a+b+c))	;
	}


	public static void main(String[] args) {
		add(10,5,20);      //calling parameterized static method inside main method
		
	}

}
