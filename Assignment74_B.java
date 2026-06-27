//WAP to create relation between 2 classes having non-static methods using extends keyword. Single Level Inheritance from 2 different program


package assignment.module1;

public class Assignment74_B  extends  Assignment74_A        //Child class
{

	public static void main(String[] args)
	{
		Assignment74_B a=new Assignment74_B();    // Creating child class object
		a.sum();                                      //calling non static method of parent class using child class object
		a.div();                                   //calling non static method of parent class using child class object
	}

}
