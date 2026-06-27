//Write a Program to check the average of the given numbers which are present in your array

package assignment.module1;

public class Assignment_141 {

	public static void main(String[] args)
	{
		int n[]=new int[4];
		n[0]=20;
		n[1]=35;
		n[2]=30;
		n[3]=10;
		
		int sum=0;
		int avg=0;
		
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
			avg=sum/n.length;
		}
		System.out.println("Sum of array elements :"+sum);
		System.out.println("Average of array elements :"+avg);

	}

}
