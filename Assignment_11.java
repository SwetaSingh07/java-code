//Write a program using different math class methods
package assignment.module1;

public class Assignment_11 {


	public static void main(String[] args) {
		
		int a=6;                 //local variable
		int b=9;                 //local variable
		float c= -10.05f;         //local variable
		int d=25;
		System.out.println("Sum of two nos. : "  +Math.addExact(a,b));
		System.out.println("Difference of two nos. : "  +Math.subtractExact(a,b));
		System.out.println("Abosolute of a number : "  +Math.abs(c));
		System.out.println("Muliplication of two nos. : "  +Math.multiplyExact(a,b));
        System.out.println("Minimum of two nos. : "  +Math.min(a,b));
        System.out.println("Maximum of two nos. : "  +Math.max(a,b));
        System.out.println("Squareroot of a nos. : "  +Math.sqrt(d));
        System.out.println("Power of a number : "  +Math.pow(a, 2));
        System.out.println("Random number between 0 and 1: " + Math.random()); //no argument should be passed to this method
	}

}
