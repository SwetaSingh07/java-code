// Write a program using multi-level inheritance to calculate salary (Employee → Salary → Bonus)

package assignment.module1;

  class Employees
  {
	int id=101;
	String name="Sweta";
	
	void emp()
	{
		System.out.println("Employee ID is "+id);
		System.out.println("Employee Name is "+name);
	}
   }
  
  class Salary extends Employees
  {
	double  basicsal= 98000;
	
	
	void sal()
	{
		System.out.println("Employee Salary is "+basicsal);
		
	}
   }
  
  class Bonus extends Salary
  {
	double  bon= basicsal*0.10;    //10 percent of basic salary
	
	
	void totalbonus()
	{
		System.out.println("Employee Bonus is "+bon);
		System.out.println("Total Salary :"+(basicsal+bon));
		
	}
   }


public class Assignment_80 {

	public static void main(String[] args) {
		

		Bonus e=new Bonus();
		e.totalbonus();
		e.sal();
		e.emp();
		
	}

}
