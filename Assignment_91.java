//Write a program on Non Paramterized this calling statement

package assignment.module1;

class Const
{
	Const()    
	{
		System.out.println("This is Non Paramterized constructor ");
	}
	Const(int a)     //A parameterized constructor calls a non-parameterized constructor
	{
		this();
		System.out.println("This is a Paramterized constructor");
	}
}

public class Assignment_91
{

	public static void main(String[] args) 
	{
		Const a=new Const(7);	  //this will call both Non Paramterized and Paramterized constructor bcz of this calling statement
	
    Const b=new Const();    //- This will only call Non Paramterized
	}

}
