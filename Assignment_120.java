//Write A Program on This Keyword

package assignment.module1;

public class Assignment_120 
{

	int a=10;   //Instance variable
	
	void show()
	{
		int a=25;  //local variable
		
		System.out.println("Local variable :"+a);
	
		System.out.println("Global variable :"+this.a);
	}
	public static void main(String[] args) 
	{
		
		Assignment_120  obj=new Assignment_120 ();
		obj.show();
	}

}
