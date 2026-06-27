//Write A Program on super  calling statement using non-parameterized super calling statement

package assignment.module1;

 class Parent 
{
	 Parent() 
    {
        System.out.println("This is parent constructor");
    }
}

class Child extends Parent 
{
    Child()
    {
        super();   // calls parent constructor
        System.out.println("This is child constructor");
    }
}
    public class Assignment_88 
    {

    public static void main(String[] args)
    {
        Child c=new Child();   
    }
}
