//Write A Program on method overriding
	
package assignment.module1;
	
   class SuperKeywordDemo
	{
		
		void Method1()
		{
		    
			System.out.println("This is Parent Class method");
		}
	}
	public class Assignment_118 extends SuperKeywordDemo 
	{
		void Method1()
		{
			
			System.out.println("Parent Class is being overridden in child");
			
		}
	
	
		public static void main(String[] args)
		{
			SuperKeywordDemo obj=new Assignment_118();   //Upcasting
			obj.Method1();
		}
	
	}
	
