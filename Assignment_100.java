//Write a Program with all types of access specifier for static global variable and try to access them outside the package without becoming the sub class

package assignment.module1;

import module_1.AccessSpecifierClass;

public class Assignment_100
{

	public static void main(String[] args) 
	{
		System.out.println("Public variable :"+AccessSpecifierClass.a);
		//System.out.println("Default variable :"+AccessSpecifierClass.b); - default cannot be accessed from another Class in diff pkg
		//System.out.println("Protected variable :"+AccessSpecifierClass.c); - protected cannot be accessed from another Class in diff pkg
		//System.out.println("private variable :"+AccessSpecifierClass.d);   - private cannot be accessed from another Class in diff pkg
	}

}
