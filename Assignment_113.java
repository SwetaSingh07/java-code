//Write a Program with all types of access specifier for non static methods and try to access them outside the package without becoming the sub class

package assignment.module1;

import module_1.NonStaticMethods;

public class Assignment_113 {

	public static void main(String[] args) 
	{
		
		NonStaticMethods obj=new NonStaticMethods();
		
		obj.publicMethod();
		//obj.privateMethod();   //this cannot be accessed by another class outside the pkg
		//obj.defaultMethod();    //this cannot be accessed by another class outside the pkg
		//obj.protectedMethod();    //this cannot be accessed by another class outside the pkg
	}

}
