//Write a Program with all types of access specifier for constructor and try to access them with in the same class inside package

package assignment.module1;

public class Assignment_114 
{
    // Public constructor
    public Assignment_114 (int a) 
    {
        System.out.println("PUBLIC constructor");
    }

    // Protected constructor
    protected Assignment_114(double b) 
    {
        this(10);  // calling public constructor
        System.out.println("PROTECTED constructor");
    }

    // Default constructor
    Assignment_114 (String s) 
    {
        this(20.5);  // calling protected constructor
        System.out.println("DEFAULT constructor");
    }

    // Private constructor
    private Assignment_114 () 
    {
        this("Hello");  // calling default constructor
        System.out.println("PRIVATE constructor");
    }

    public static void main(String[] args) 
    {
        // Accessing all constructors indirectly
        new Assignment_114 ();   // starts from private constructor
    }
}