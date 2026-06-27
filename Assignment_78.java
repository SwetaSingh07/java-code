//Write a Program for Multi Level Inheritance

package assignment.module1;

 class GrandClass       // This is Grandparent Class
{
	static void A()
	{
		System.out.println("This is Grand parent Class A");
	}
}

class  ParentClass extends GrandClass             // This is Parent Class which is inheriting  Grandparent Class
{
	static void B()
	{
		System.out.println("This is Parent Class B");
	}
} 
class Assignment_78 extends ParentClass                   // This is Child Class which is inheriting  Parent Class
{
	
	static void C()
	{
		System.out.println("This is Child Class C");
	}


	public static void main(String[] args) 
	{
		A();
		B();
		C();

	}

	}


