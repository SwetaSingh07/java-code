//Write a Program with all types of access specifier for static methods and try to access them with in the same class inside package

package assignment.module1;

public class Assignment_106 
{
	public static void publicMethod()
	{
		System.out.println("This is Public Method");
	}
	private static void privateMethod()
	{
		System.out.println("This is Private Method");
	}
	 static void defaultMethod()
	{
		System.out.println("This is Default Method");
	}
	 protected static void protectedMethod()
		{
			System.out.println("This is Protected Method");
		}

	public static void main(String[] args)
	{
		publicMethod();
		privateMethod();
		defaultMethod();
		protectedMethod();
	}

}
