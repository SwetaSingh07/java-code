//Write a Program with all types of access specifier for instance global variable and try to access them with in the same class

package assignment.module1;

public class Assignment_102 
{
	 public  int a=13;   //public Global Instance variable
	 int b=29;         // //default Global Instance variable
	 protected  int c=20;    //protected Global Instance variable
	 private  int d=55;       //private Global Instance variable

	public static void main(String[] args)
	
	{
		Assignment_102 obj=new Assignment_102();
		
		
		System.out.println("Public variable :"+obj.a);
		System.out.println("Default variable :"+obj.b); 
		System.out.println("Protected variable :"+obj.c);
		System.out.println("private variable :"+obj.d);  
		

	}

}
