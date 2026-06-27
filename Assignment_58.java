/* Write a program to calculate grade based on marks: 
 90+ = A
 75-89 = B
 50-74=C
 Below 50 = Fail
must use if else and scanner class */

package assignment.module1;

import java.util.Scanner;

public class Assignment_58 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	     
	     System.out.println("Enter your marks");
	     double marks=sc.nextInt();
	     
	     if(marks>=90)
	     {
	    	 System.out.println("A Grade");
	    
	     }
	     else if(marks>=75 && marks<=89)
	     {
	    	 System.out.println("B Grade");
	    
	     }
	     else if(marks>=50 && marks<=74)
	     {
	    	 System.out.println("C Grade");
	    
	     }
	     else
	     {
	    	 System.out.println("Fail"); 
	     }

        sc.close();
	}

}
