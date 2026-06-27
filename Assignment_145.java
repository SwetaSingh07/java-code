//Write A Program to count the special characters present in the String

package assignment.module1;

public class Assignment_145 {
	static int countOfNum=0;
	static int countOfAlpha=0;
	static int countOfSpace=0;
	static int countOfSpecialChar=0;

	public static void main(String[] args) {
		String s="sweta123!@*#";
		char[] ch=s.toCharArray();  //converting string to array
		
		for(int i=0;i<s.length();i++)   //starting loop to check each index
		{
			boolean num=Character.isDigit(ch[i]);   //checking for numbers in given string
			if(num)
			{
				countOfNum++;    //if condition is true then count will increase
			}
			boolean alpha=Character.isAlphabetic(ch[i]);   //checking for alphabets in given string
			if(alpha)
			{
				countOfAlpha++;    //if condition is true then count will increase
			}
			boolean space=Character.isWhitespace(ch[i]);   //checking for space in given string
			if(space)
			{
				countOfSpace++;    //if condition is true then count will increase
			}
			
			
			
		}
		System.out.println(countOfNum);
		System.out.println(countOfAlpha);
		System.out.println(countOfSpace);
		countOfSpecialChar=s.length()-(countOfNum+countOfAlpha+countOfSpace);
		System.out.println(countOfSpecialChar);
		
	}

}
