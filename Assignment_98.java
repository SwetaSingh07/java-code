//Write a Program with all types of access specifier for static global variable and try to access them outside the class

package assignment.module1;

class Variabledemo
{
	public static int a=20;   //public Global Static variable
	 static int b=10;         // //default Global Static variable
	 protected static int c=25;    //protected Global Static variable
	 private static int d=15;       //private Global Static variable
	
}

public class Assignment_98 {

	public static void main(String[] args) 
	{
		
		System.out.println("Public variable :"+Variabledemo.a);
		System.out.println("Default variable :"+Variabledemo.b);
		System.out.println("Protected variable :"+Variabledemo.c);
		//System.out.println("private variable :"+Variabledemo.d);   - private from another class cannot be accessible
		
	}

}
