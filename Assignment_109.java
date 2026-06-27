//Write a Program with all types of access specifier for static methods and try to access them outside the package without becoming the sub class

package assignment.module1;

import module_1.AccessSpecifierMethods;

public class Assignment_109 {

	public static void main(String[] args)
	{
     AccessSpecifierMethods obj=new AccessSpecifierMethods();
		
		obj.publicMethod();
		//obj.privateMethod();   //this cannot be accessed by another class outside the pkg
		//obj.defaultMethod();    //this cannot be accessed by another class outside the pkg
		//obj.protectedMethod();    //this cannot be accessed by another class outside the pkg

	}

}
