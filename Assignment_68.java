//Write a program using nested if Check username  If correct, then check password Print login success or failure

package assignment.module1;

public class Assignment_68 {

	public static void main(String[] args) {
		
		String name="Sweta Sin";
		String password="@Jan2026";
		
		if(name=="Sweta Singh")
		{
			if(password=="@Jan2026")
			{
				System.out.println("Logged in sucessfully");
			}
			else
			{
				System.out.println("Unable to login");
			}
		}
		else
		{
			System.out.println("Invalid credentials");
		}
		
	}

}
