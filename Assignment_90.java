//Write A Program on this calling statement multi level inheritance

package assignment.module1;

class A
{
    A()
    {
        this(100);   // calls parameterized constructor of same class
        System.out.println("A Default Constructor");
    }

    A(int a)
    {
        System.out.println("A Parameterized Constructor: " + a);
    }
}

class B extends A
{
    B()
    {
        this(200);   // calls parameterized constructor of same class
        System.out.println("B Default Constructor");
    }

    B(int b)
    {
        super();     // calls A()
        System.out.println("B Parameterized Constructor: " + b);
    }
}

class C extends B
{
    C()
    {
        this(300);   // calls parameterized constructor of same class
        System.out.println("C Default Constructor");
    }

    C(int c)
    {
        super();     // calls B()
        System.out.println("C Parameterized Constructor: " + c);
    }
}

public class Assignment_90
{
    public static void main(String[] args)
    {
        C obj = new C();   // object creation
    }
}
  