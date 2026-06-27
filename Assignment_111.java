//Write a Program with all types of access specifier for non static methods and try to access them outside the class

package assignment.module1;


class NonStaticMethods
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
}

public class Assignment_111 {

	public static void main(String[] args) 
	{
		NonStaticMethods  obj=new NonStaticMethods ();
		
		obj.publicMethod();
		//obj.privateMethod();   //this cannot be accessed by another class outside the pkg
		obj.defaultMethod();    //this cannot be accessed by another class outside the pkg
		obj.protectedMethod();    //this cannot be accessed by another class outside the pkg
		

	}

}
