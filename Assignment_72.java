//Write a program for single-level inheritance using a Non-static method in the single package explorer
package assignment.module1;

 class ParentClasss
{
    int a = 7;
    int b = 5;

    void multiply()         //Non-static method of parent class
    {
        System.out.println("Multiplication = " + (a * b));
    }
}
    

  public class Assignment_72 extends ParentClasss
    {
        int d = 70;
        int e = 5;

        void div()               //Non-static method of child class
        {
            System.out.println("Division = " + (d / e));
        }

        public static void main(String[] args)
        {
        	Assignment_72 obj = new Assignment_72();  // child class object
            //Xyllo c = obj.new Xyllo();          

            obj.multiply();
            obj.div();
        }
    }

 


