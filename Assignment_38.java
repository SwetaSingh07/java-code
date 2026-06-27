//Write A Program to update static and non static global variable
package assignment.module1;

public class Assignment_38 {
	
	int age=40;
	static int count=10;

	public static void main(String[] args) {
		
		Assignment_38 a=new Assignment_38();
		a.age=48;   //updated Non static  global variable with the help og object and refernce variable
		System.out.println("Updated Age is :" +a.age);
		count=25;      //updated static  global variable
		System.out.println(count);

	}

}
