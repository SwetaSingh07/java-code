/*Write a program where
 Input is"Manish Kumar tiwari"
 Output"
 M
 K
 T*/

package assignment.module1;

public class Assignment_159 
{

	public static void main(String[] args) 
	{
	String name ="Manish Kumar Tiwari";
	
	String n[]=name.split(" ");
	
	for(int i=0;i<n.length;i++)
	{
		System.out.println(n[i].charAt(0));
	}
	
	
	


}

}
