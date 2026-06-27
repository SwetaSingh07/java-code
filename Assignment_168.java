//Write a program to show is empty functions in ArrayList

package assignment.module1;

import java.util.ArrayList;

public class Assignment_168 {

	public static void main(String[] args)
	{
		
		ArrayList<Double> a=new  ArrayList<Double>();
	     a.add(100.98);  //using add(Object)
	     a.add(45.78);
	     a.add(20.64);
	     a.add(78.00);
	     a.add(23.45);
	     
	     System.out.println(a);
	     
	     boolean b=a.isEmpty();   // isEmpty when collection has objects
	     System.out.println(b);
	     
	     a.clear();
	     
	     System.out.println(a);
	     
	     boolean c=a.isEmpty();     // isEmpty when objects are deleted from collection
	     System.out.println(c);
	     
	     
	     

	}

}
