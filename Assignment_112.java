//Write a Program with all types of access specifier for non static methods and try to access them outside the package by becoming the sub class

package assignment.module1;

import module_1.NonStaticMethods;

public class Assignment_112 extends NonStaticMethods
{

	public static void main(String[] args) 
	{
		Assignment_112 obj=new Assignment_112();
		
		obj.publicMethod();
		//obj.privateMethod();   //this cannot be accessed by another Subclass outside the pkg
		//obj.defaultMethod();    //this cannot be accessed by another Subclass outside the pkg
		obj.protectedMethod();    

	}

}
