//Write a Program with all types of access specifier for non static methods and try to access them with in the same class

package assignment.module1;

public class Assignment_110 
{


public void  publicMethod()
{
	System.out.println("This is Non -Static Public Method");
}
private  void privateMethod()
{
	System.out.println("This is Non -Static Private Method");
}
  void defaultMethod()
{
	System.out.println("This is Non -Static Default Method");
}
 protected  void protectedMethod()
	{
		System.out.println("This is Non -Static Protected Method");
	}


	public static void main(String[] args) 
	{
		
		Assignment_110  obj=new Assignment_110 ();
		
		obj.publicMethod();
		obj.privateMethod();   
		obj.defaultMethod();    
		obj.protectedMethod();    
		
	}

}



