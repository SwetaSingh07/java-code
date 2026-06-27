//Write a Program with all types of access specifier for instance global variable and try to access them outside the class however with in the package

package assignment.module1;

class InstanceVariable
{
	public  int a=13;   //public Global Instance variable
	 int b=29;         // //default Global Instance variable
	 protected  int c=20;    //protected Global Instance variable
	 private  int d=55;       //private Global Instance variable
}

public class Assignment_103 
{

	public static void main(String[] args)
	{
		InstanceVariable obj=new InstanceVariable();
		
		System.out.println("Public variable :"+obj.a);
		System.out.println("Default variable :"+obj.b); 
		System.out.println("Protected variable :"+obj.c);
		//System.out.println("private variable :"+obj.d);   //private instance varibale cannot be accessed by another class

	}

}
