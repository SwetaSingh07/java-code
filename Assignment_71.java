//Write a program for single-level inheritance using a static method in the single package explorer

package assignment.module1;

class SuperClass_A
{
    static int a = 50;
    static int b = 20;

    static void add()
    {
        System.out.println("Sum = " + (a + b));
    }
}

  public class Assignment_71 extends SuperClass_A
{
    static int x = 40;
    static int y = 10;

    static void sub()
    {
        System.out.println("Difference = " + (x - y));
    }


    public static void main(String[] args)
    {
        add();
        sub();
    }
}