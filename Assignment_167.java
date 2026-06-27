//Write a program to show all available remove functions in ArrayList

package assignment.module1;

import java.util.ArrayList;

public class Assignment_167 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> b=new  ArrayList<String>();
	     b.add("Ram");
	     b.add("Anuj");
	     b.add("Sandy");
	     b.add("Nick");
	     b.add("Kamya");
	     b.add("Sanju");
	     b.add("Ankit");
	     
	     
	     ArrayList<String> a=new  ArrayList<String>();
	     a.add("Sneha");
	     a.add("kamya");
	     
	     System.out.println(b);
	     
	     b.remove("Ram");   //removing object
	     System.out.println(b);
	     
	   
	     b.remove(1);   //removing object at given index
	     System.out.println(b);
	     
	     b.removeFirst();
	     System.out.println(b);
	     
	     b.removeLast();
	     System.out.println(b);
	     
	       
	    
	    System.out.println("This is second collection :"+a);
	    a.removeAll(b);               //not working
	    System.out.println("This is first collection :" +b);   
	    
	     
		

	}

}
