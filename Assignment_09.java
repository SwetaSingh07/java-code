/*Write a program to create static methods along with a main method that performs to calculate Area and Circumference 
for Square, Triangle, Rectangle and Circle using arithmetic operators */

package assignment.module1;

public class Assignment_09 {
	
	 // Square
    static void square(int side) {
        int area = side * side;
        int perimeter = 4 * side;
        System.out.println("Square Area = " + area);
        System.out.println("Square Perimeter = " + perimeter);
        System.out.println();
    }

    // Rectangle
    static void rectangle(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Area = " + area);
        System.out.println("Rectangle Perimeter = " + perimeter);
        System.out.println();
    }

    // Triangle
    static void triangle(int base, int height, int side1, int side2, int side3) {
        double area = 0.5 * base * height;
        int perimeter = side1 + side2 + side3;
        System.out.println("Triangle Area = " + area);
        System.out.println("Triangle Perimeter = " + perimeter);
        System.out.println();
    }

    // Circle
    static void circle(double radius) {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circle Area = " + area);
        System.out.println("Circle Circumference = " + circumference);
        System.out.println();
    }



	public static void main(String[] args) {
		 square(5);
	     rectangle(10, 4);
	     triangle(6, 8, 5, 7, 9);
	     circle(7);

	}

}
