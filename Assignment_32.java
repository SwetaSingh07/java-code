//Write a Program to calculate Area and Circumference for Square, Triangle, Rectangle and Circle using math class
package assignment.module1;

import java.util.Scanner;

public class Assignment_32 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of circle");
		double r=sc.nextDouble();
		double areaOfCircle=Math.PI*Math.pow(r, 2);
		double periOfCircle=2*Math.PI*r;
		
		System.out.println("Area of circle is : "+areaOfCircle);
		System.out.println("Perimeter of circle is : "+periOfCircle);
		
		System.out.println("Enter side of square");
		double side=sc.nextDouble();
		
		double areaOfSquare=Math.pow(side, 2);
		double periOfSquare=4*side;
		
		System.out.println("Area of Square is : "+areaOfSquare);
		System.out.println("Perimeter of Square is : "+periOfSquare);
		
		System.out.println("Enter the length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b=sc.nextInt();
		int areaOfRectangle=l*b;
		int perimOfRect=2*(l+b);
		System.out.println("Area of Rectangle is : "+areaOfRectangle);
		System.out.println("Perimeter of Rectangle is : "+perimOfRect);
		
		System.out.println("Enter the base of triangle");
		int s1=sc.nextInt();
		
		System.out.println("Enter the height of triangle");
		int s2=sc.nextInt();
		
		System.out.println("Enter the 2 other sides of triangle");
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		double areaOfTriangle=0.5*s1*s2; //this is printing 0 , not sure why
		//double areaOfTriangle=1/2*Math.multiplyExact(s1, s2);
		double perimOfTriangle=Math.addExact(s3, s4)+s1;
		System.out.println("Area of Triangle is : "+areaOfTriangle);
		System.out.println("Perimeter of Triangle is : "+perimOfTriangle);
		
		
		sc.close();
	}

}
