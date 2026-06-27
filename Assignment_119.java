package assignment.module1;


	class OverrideDemo
	{
		
		void add()
		{
		    
			System.out.println("This is Parent class Method");
		}
	}
	public class Assignment_119 extends OverrideDemo 
	{
		void add()
		{
			
			System.out.println("Parent class is being overridden in child");
			
		}
	
	
		public static void main(String[] args)
		{
			Assignment_119 obj=new Assignment_119();
			obj.add();
		}
	
	}


