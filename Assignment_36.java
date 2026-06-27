//Write A Program on Final Variable
package assignment.module1;

public class Assignment_36 {
	
	final static int a=10; //final global vaiable cannot be updated
	final static int b=40;
	

	public static void main(String[] args) {
		System.out.println("Sum of two final variables :"+(a+b));
		
		final int NoOfDays=7;  //final local varibale
		System.out.println(NoOfDays);

	}

}
