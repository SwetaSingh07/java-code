/*Write a Program to calculate Area and Circumference for Square, Triangle, Rectangle and Circle using 
arithmetic operators*/

package assignment.module1;

public class Assignment_08{
	  static int r=5;
	   static double AreaOfCircle=3.14*r*r;
	  
	   static int side=5;
	   static int AreaOfSquare=side*side;
	   
	   
	   int b=5;
	   int h=7;
	   float AreaOfTriangle=(b*h)/2f; 
	   
	   int l=5;
	   int br=7;
	   int AreaOfRectangle=l*br;
	   
	   static void PerimeterOfTriangle()
	  
	   {
		   int a=5;
		   int b =6;
		   int c=8;
		   int PerimTriangle=a+b+c;
		   System.out.println("Preimeter of Triangel =" +PerimTriangle);   
	   }

	   static void PerimeterOfCircle(int r)
		  
	   {
		   
		   double CircumCircle=2*3.14*r;
		   System.out.println("Circumference of Circle =" +CircumCircle);   
	   }
	   static void PerimeterOfSquare(int side)
		  
	   {
		   
		   int PerimSquare=4*side;
		   System.out.println("Perimeter of Square =" +PerimSquare);   
	   }
	   
	   static void PerimeterOfRectangle(int length, int breadth)
		  
	   {
		   
		   int PerimRect=2*(length+breadth);
		   System.out.println("Perimeter of Rectangle =" +PerimRect);   
	   }

	public static void main(String[] args) {
		System.out.println("Area of circle="+AreaOfCircle);
		 System.out.println("Area of Circle =" +AreaOfSquare);
		 
		 Assignment_08 z=new Assignment_08(); // creating object to call instance variable
		 System.out.println("Area of Triangle=" +z.AreaOfTriangle); //Calling instance variable to utilise it in code
		 System.out.println("Area of Rectangle =" +z.AreaOfRectangle);
		 
		 PerimeterOfTriangle(); // calling static method
		 PerimeterOfCircle(4); //calling static parameterized method
		 PerimeterOfSquare(7);
		 PerimeterOfRectangle(7, 12);
	}

}
