//Write a program to create a class consist of static, Non Static and constructor method and call each of them in a non parameterized way

package assignment.module1;

public class Assignment_25 {
	
	 public static void meth1()   //staic non parameterized method
	 {
		 System.out.println("This is a Static method");
	 }
	 public void meth2()     //Non-staic non-parameterized method
	 {
		 System.out.println("This is a Non static method");
	 }
	 Assignment_25()      //Constructor 
	 {
		 System.out.println("This is a contructor method");
	 }

	public static void main(String[] args) {
		meth1();
		Assignment_25 c= new Assignment_25(); //creating object to call non static method and it will also call the constructor
		c.meth2();  //calling non static mthod
		
		
		
	}

}
