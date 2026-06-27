//Write a Program with all types of access specifier for static methods and try to access them from different class

package assignment.module1;

class AccessSpecifier
{
	public static void publicMethod()
	{
		System.out.println("This is Public Method");
	}
	private static void privateMethod()   //this can be accessed only within same class
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
}

public class Assignment_107 
{

	public static void main(String[] args)
	{
		AccessSpecifier obj=new AccessSpecifier();
		
		obj.publicMethod();
		//obj.privateMethod();   //this acnnpt be accessed from another class
		obj.defaultMethod();
		obj.protectedMethod();

	}

}
