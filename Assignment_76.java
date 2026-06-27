//Write A Program to create relation between 2 classes having non-static methods using extends keyword. Single Level Inheritance from 2 different package

package assignment.module1;

import module_1.SuperClass;

public class Assignment_76  extends SuperClass
{

	public static void main(String[] args) 
	
	{
		Assignment_76 x=new Assignment_76();
		x.sub();
		SuperClass.add();

	}

}
