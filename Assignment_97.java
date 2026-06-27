//Write a Program with all types of access specifier for static global variable and try to access them with in the same class

package assignment.module1;

public class Assignment_97 
{
    // Static global variables with different access specifiers
    private static int a = 10;
    static int b = 20;              // default
    protected static int c = 30;
    public static int d = 40;

    public static void main(String[] args)
    {
        // Accessing all variables within the same class
        System.out.println("Private variable a: " + a);
        System.out.println("Default variable b: " + b);
        System.out.println("Protected variable c: " + c);
        System.out.println("Public variable d: " + d);
    }
}