//Write a Java program where Vehicle is extended by Car and Bike to display different features.

package assignment.module1;


class Vehicle      //first class
{
	void motion()
	{
	System.out.println("Have engines or mechanisms for motion");
	}
}
class Car extends Vehicle        //second class
{
	int wheels=4;
	void drive()
	{
	System.out.println("Car has "+ wheels +" wheels");
	}
	
	
}
class Bike extends Vehicle                        //third class
{
	int tyres=2;
	void ride()
	{
	System.out.println("Bike has "+ tyres +" tyres");
	}
	
}

public class Assignment_81 {

	public static void main(String[] args)
	{
		Bike b =new Bike();
		b.ride();
		//b.drive(); // This is wrong bcz car is not extended by bike so we need to create object for Car Class to access it's method
		
		Car c =new Car();
		c.drive();
		
		c.motion();   //this is called by second class
		b.motion();        //this is called by third class

	}

}
