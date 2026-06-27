//Write a Program to Check if the given Array has the value 100 is present at index also find out its indexing

package assignment.module1;

public class Assignment_142 {

	public static void main(String[] args)
	
	{
		int arr[]=new int[4];
		arr[0]=15;
		arr[1]=35;
		arr[2]=100;
		arr[3]=80;
		
		
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==100)
			{
				System.out.println("100 is present at index "+i);
			}
			
		}
		
	}

}
