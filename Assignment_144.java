//Write A Program to count the number of numeric values present in the String

package assignment.module1;

public class Assignment_144 {
	static int countOfNum=0;

	public static void main(String[] args)
	{
		String s="sweta123!";
		char[] ch=s.toCharArray();  //converting string to array
		
		for(int i=0;i<s.length();i++)   //starting loop to check each index
		{
			boolean num=Character.isDigit(ch[i]);
			if(num)
			{
				countOfNum++;
			}
		}
		System.out.println(countOfNum);
		
	}

}
