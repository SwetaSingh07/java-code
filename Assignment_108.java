//Write a Program with all types of access specifier for static methods and try to access them outside the package by becoming the sub class

package assignment.module1;

import module_1.AccessSpecifierMethods;

public class Assignment_108 extends AccessSpecifierMethods
{

	public static void main(String[] args) 
	{
		
		AccessSpecifierMethods obj=new AccessSpecifierMethods();
		
		obj.publicMethod();
		//obj.privateMethod();   //this cannot be accessed by another Subclass
		//obj.defaultMethod();    //this cannot be accessed from another Subclass
		obj.protectedMethod();
	}

}
