//Write a Program with all types of access specifier for static global variable and try to access them outside the package by becoming the sub class

package assignment.module1;

import module_1.AccessSpecifierClass;

public class Assignment_99 extends AccessSpecifierClass
{

	public static void main(String[] args)
	{
		System.out.println("Public variable :"+AccessSpecifierClass.a);
		//System.out.println("Default variable :"+AccessSpecifierClass.b); - default cannot be accessed from another sublass in diff pkg
		System.out.println("Protected variable :"+AccessSpecifierClass.c);
		//System.out.println("private variable :"+AccessSpecifierClass.d);   - private cannot be accessed from another sublass in diff pkg
	}

}
