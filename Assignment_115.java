//Write a Program with all types of access specifier for constructor and try to access them from different class 

package assignment.module1;

class ConstructorDemo
{
	 // Public constructor
    public ConstructorDemo (int a) 
    {
        System.out.println("PUBLIC constructor");
    }

    // Protected constructor
    protected ConstructorDemo(double b) 
    {
        System.out.println("PROTECTED constructor");
    }

    // Default constructor
    ConstructorDemo (String s) 
    {        
        System.out.println("DEFAULT constructor");
    }

    // Private constructor
    private ConstructorDemo () 
    {        
        System.out.println("PRIVATE constructor");
    }
}

public class Assignment_115 
{

	public static void main(String[] args)
	{
		new ConstructorDemo(10);
		new ConstructorDemo("Sweta");
		new ConstructorDemo(34.34);
		//new ConstructorDemo();   - This cannot be accessed by another class of same pkg

	}

}
