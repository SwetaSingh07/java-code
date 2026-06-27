//Write a Program with all types of access specifier for constructor and try to access them outside the package by becoming the sub class


package assignment.module1;

import module_1.ConstrucMethod;

public class Assignment_116 extends ConstrucMethod
{
	Assignment_116()
	{
		super(10);
	}

	public static void main(String[] args) 
	{
		Assignment_116 c=new Assignment_116();

	}

}
