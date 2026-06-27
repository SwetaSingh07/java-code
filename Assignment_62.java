//Write a program to launch different browsers using Scanner class in switch Concept
package assignment.module1;

import java.util.Scanner;

public class Assignment_62 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select browser to launch");
		System.out.println("1 : Chrome");
		System.out.println("2 : FireFox");
		System.out.println("3 : Safari");
		//System.out.println("4 : Edge"); - this is added under default so it will be executed whenever any option is selected outside of the given list
		
		System.out.println("Enter your Browser to be launched");
		int br=sc.nextInt();
		
		switch(br)
		{
		case 1:
			System.out.println("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN1289G0&p=chrome");
			break;
		case 2:
			System.out.println("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN1289G0&p=firefox+browser");
			break;	
		case 3:
			System.out.println("hhttps://in.search.yahoo.com/search?fr=mcafee&type=E210IN1289G0&p=safari+browser");
			break;				
	
	    default:
		  System.out.println("https://in.search.yahoo.com/search;_ylt=Awrx_1HChsFpIwIAihO7HAx.;_ylc=X1MDMjExNDcyMzAwMwRfcgMyBGZyA21jYWZlZQRmcjIDc2ItdG9wBGdwcmlkA0lBSXNKS042VGxPLlFLMXUxWldLUUEEbl9yc2x0AzAEbl9zdWdnAzkEb3JpZ2luA2luLnNlYXJjaC55YWhvby5jb20EcG9zAzAEcHFzdHIDBHBxc3RybAMwBHFzdHJsAzEyBHF1ZXJ5A2VkZ2UlMjBicm93c2VyBHRfc3RtcAMxNzc0MjkwNjM4?p=edge+browser&fr=mcafee&type=E210IN1289G0&fr2=sb-top");
		
		  sc.close();
	
	
	}

	}
}


