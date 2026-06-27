//Write a program with combination of 2 static parameterized and 2 nonparameterized methods and try calling all of themin main method

package assignment.module1;

public class Assignment_05 {

	static void div(int a, int b)
	{
	System.out.println(a/b);

	}
	static void mod(int c, int d)
	{
	System.out.println(c%d);

	}
	
     void add()
     {
    	 System.out.println("Non Parameterized Method 1"); 
     }
     void sub()
     {
    	 System.out.println("Non Parameterized Method 2"); 
     }
	public static void main(String[] args) 
	{
		div(10,5);    //calling div method which will print the quotient
		mod(27,5);    //calling mod method which will print reminder
		Assignment_05 k=new Assignment_05(); //created object to call non static method
		k.add();  //calling non-static and non-parameterized method with the help of reference variable
		k.sub();
	}

}
