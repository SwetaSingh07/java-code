//Write a Program to call a parameterized non static method present outside your own class
package assignment.module1;

 class MyClass{     // This is Class 1
	 
	 void sub(int a,int b)
	 {
		 System.out.println("Subtraction of two nos .:"+(a-b));
	 }
 }

public class Assignment_19 {    //This is Class 2

	public static void main(String[] args) {
		MyClass m=new MyClass();    // creating object of classs 1
		m.sub(58,10);              //calling parameterized non static method present outside of this class
		
	}

}
