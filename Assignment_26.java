//Write a program to create a class consist of static, Non Static and constructor method and call each of them in a parameterized way
package assignment.module1;

public class Assignment_26 {

	public static void meth1(int a)   //staic non parameterized method
	 {
		 System.out.println("This is a Static method");
	 }
	 public void meth2(int b , double c)     //Non-staic non-parameterized method
	 {
		 System.out.println("This is a Non static method");
	 }
	 Assignment_26(char d)      //Constructor 
	 {
		 System.out.println("This is a contructor method");
	 }

	public static void main(String[] args) {
		meth1(4);
		Assignment_26 c= new Assignment_26('A'); //creating object to call non static method and it will also call the constructor
		c.meth2(5,2.5);  //calling non static mthod
		
		
		
	}

}
