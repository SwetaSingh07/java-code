// Write a program with combination of super and this calling statement 

package assignment.module1;

class A01
{
	A01()
    {
        this(100);   // calls parameterized constructor of same class
        System.out.println("A Default Constructor");
    }

	A01(int a)
    {
        System.out.println("A Parameterized Constructor: " + a);
    }
}

class B01 extends A01
{
	B01()
    {
        this(200);   // calls parameterized constructor of same class
        System.out.println("B Default Constructor");
    }

	B01(int b)
    {
        super();     // calls A()
        System.out.println("B Parameterized Constructor: " + b);
    }
}

class C01 extends B01
{
	C01()
    {
        this(300);   // calls parameterized constructor of same class
        System.out.println("C Default Constructor");
    }

	C01(int c)
    {
        super();     // calls B()
        System.out.println("C Parameterized Constructor: " + c);
    }
}


public class Assignment_101 {

	public static void main(String[] args) 
	{
		C01 obj=new C01(10);

	}

}
