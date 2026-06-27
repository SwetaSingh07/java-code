//Write a program to show all available add functions in ArrayList

package assignment.module1;

import java.util.ArrayList;

public class Assignment_166 {

	public static void main(String[] args)
	{
		
     ArrayList<Integer> a=new  ArrayList<Integer>();
     a.add(100);  //using add(Object)
     a.add(45);
     a.add(20);
     a.add(78);
     a.add(23);
    
     
     System.out.println(a);
     int l=a.size();    //checking length of collection a
     System.out.println("Size of collection b is :"+l);
     
     a.iterator();                   //Iterating collection a using Iterator
     System.out.println(a);
     
     ArrayList<Integer> b=new  ArrayList<Integer>();
     b.add(27);
     b.add(98);
     b.add(105);
     b.add(86);
     
     b.add(3,54);  //adding one object via index using add(index,object)
    
     
     System.out.println(b);
     int k=b.size();    //checking length of collection b
     System.out.println("Size of collection b is :"+k);
     
     b.listIterator();     //Iterating collection b using ListIterator
     System.out.println(b);
     
     a.addAll(b); //adding 2 collection using addAll
     System.out.println(a);
     
     boolean c=a.equals(b);    // checking if 2 collections are equal using equals()
     System.out.println(c);
     
     int x=a.indexOf(4);   // checking position of 4 in collection a which is not there so it will print -1
     System.out.println(x);
     
     int z=b.lastIndexOf(105); //using lastindexOf for collection b for the mentioned object
     System.out.println(z);
     
     a.remove(2);       //removing object using index from collection a
     System.out.println(a);
     
     boolean p=a.isEmpty();    // checking if there are any objects under collection or it's empty using empty method
     System.out.println(p);
     
     int m=a.get(2);
     System.out.println(m);   //fetching the object using get method via indexing
     
   
     
	}

}
