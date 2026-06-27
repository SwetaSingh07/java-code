package assignment.module1;

public class Assignment_31 {


    public static void main(String[] args) {

        // Square (side = 4)
        double side = 4;
        double squareArea = Math.pow(side, 2);
        double squarePerimeter = 4 * side;

        // Rectangle (length = 6, breadth = 3)
        double length = 6;
        double breadth = 3;
        double rectangleArea = length * breadth;
        double rectanglePerimeter = 2 * (length + breadth);

        // Triangle (sides = 3, 4, 5)
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2; // semi-perimeter
        double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
        double trianglePerimeter = a + b + c;

        // Circle (radius = 5)
        double radius = 5;
        double circleArea = Math.PI * Math.pow(radius, 2);
        double circleCircumference = 2 * Math.PI * radius;

      

        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circleCircumference);
    }
}