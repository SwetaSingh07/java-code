//Write a program on method Overloading with 5 static method and 5 non static method
package assignment.module1;

public class Assignment_24 {
	
	static void add(int a, int b)    // static method 1
	{
		System.out.println("Sum of two integers:"+(a+b));
	}
	static void add(int a, double b)    // static method 2
	{
		System.out.println("Sum of one integer & one double:"+(a+b));
	}
	static void add(double a, double b)       // static method 3
	{
		System.out.println("Sum of two double values:"+(a+b));
	}
	static void add(double a, double b , int c)          // static method 4
	{
		System.out.println("Sum of two double and one integer values:"+(a+b+c));
	}
	static void add(double a, int b , int c)          // static method 5
	{
		System.out.println("Sum of one double and two integer values:"+(a+b+c));  
	}
	 void product(double a, int b )          // Non static method 1
	{
		System.out.println("Product of one double and one integer values:"+(a*b));  
	}
	 void product(int a, int b )          // Non static method 2
		{
			System.out.println("Product of two integer values:"+(a*b));  
		}
	 void product(double a, double b )          // Non static method 3
		{
			System.out.println("Product of two double values:"+(a*b)); 
		}
	 void product(double a, int b , int c )       // Non static method 4
		{
			System.out.println("Product of one double and two integer values:"+(a*b*c));  
		}
	 void product(int a, int b , int c )         // Non static method 5
		{
			System.out.println("Product of three integer values:"+(a*b*c));  
		}
	

	public static void main(String[] args) {
		
		 add(5, 2) ;
		 add(10,23.5) ;
		 add(5.5, 2.5) ;
		 add(10.0,2.0 , 20);
		 add(5, 10 , 20) ;
		 
		 Assignment_24 n=new Assignment_24();
		 n.product(5.0, 2 ) ;
		 n.product(6, 7 ) ;
		 n.product(10.0,2.5) ;
		 n.product(2.0, 5 , 3 ) ;
		 n.product(1, 1 , 1 ) ;
		

	}

}
