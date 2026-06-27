//Write a Program to Copy the value of one array into another array

package assignment.module1;

	public class Assignment_139
	{
	
		public static void main(String[] args)
		{
			//String s[]= {"Sweta","Mona","Jia"};
			
			String s[]=new String[3];
			s[0]="Sweta";
			s[1]="Mona";
			s[2]="Jia";
			
			String x[]=new String[s.length];
			
			System.out.println("First Array is");
			
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
			
			System.out.println("\n");
			
			System.out.println("Copied array is ");
			
			for(int i=0;i<s.length;i++)
			{
				x[i]=s[i];
			
			System.out.println(x[i]);
			
			}
			
		
			
	
		}
	
	}
