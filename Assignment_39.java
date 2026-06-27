//Write A Program with same variable present locally and globally and try to access them both in main method
package assignment.module1;

public class Assignment_39 {
	
	static int a=28; //global variable

	public static void main(String[] args) {
		int a=10;   //local variable
		
		System.out.println(Assignment_39.a); //accessing global variable 
		
		System.out.println(a);   //accessing local variable

	}

}
