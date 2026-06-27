//Write A Program on Multi Level Inheritance using Interface Concept

package assignment.module1;

interface  Parent1
{
	void meth1();  //100% abstraction
}
interface  Parent2 extends Parent1
{
  void meth2();      //100% abstraction
}
	

public class Assignment_125 implements Parent2   //multi level inheritance
{
	public void meth2()     //overriding abstract method of Inteface Parent 2
	{
		System.out.println("Logic 2");
		
	}

	
	public void meth1() {   //overriding abstract method of Inteface Parent 2
		System.out.println("Logic 1");
		
	}

	public static void main(String[] args)
	{
		Assignment_125 obj=new Assignment_125();
          obj.meth1();
          obj.meth2();
	}

	
	

}
