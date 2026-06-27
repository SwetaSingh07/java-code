//Write a Program with all types of access specifier for instance global variable and try to access them outside the package without becoming the sub class

package assignment.module1;
import module_1.InstanceVariable;

public class Assignment_105 

{

	public static void main(String[] args)
	{
		InstanceVariable obj=new InstanceVariable();
		
		//System.out.println("Private variable :"+obj.l);    //private instance varibale cannot be accessed by another Subclas
		//System.out.println("Default variable :"+obj.m);     //default instance varibale cannot be accessed by another Subclas
		//System.out.println("Protected variable :"+obj.n);   //protected instance varibale cannot be accessed by another Subclas
		System.out.println("Public variable :"+obj.o); 	

	}

}
