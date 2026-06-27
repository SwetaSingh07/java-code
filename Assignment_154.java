//Write a program to showcase all the replace string function

package assignment.module1;

public class Assignment_154 
{

	public static void main(String[] args)
	{
		String s="Automobile";
		String k="Manual Testing";
		
		String m=s.replace('o','a' );
		
		String n=k.replace("Manual","Automation" );
		
		
		System.out.println(s);
		System.out.println(m);
		
		System.out.println(k);
		System.out.println(n);
		
		String x=n.replaceAll("t", "@");
		System.out.println(x);
		
		
		
		

		

	}

}
