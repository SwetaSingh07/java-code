//Write a program with three classes (Person → Employee → Manager) to display details using inheritance.

package assignment.module1;
 
	class Person    //this is first class 
	{
	    String name;
	    int age;

	    void getPersonDetails(String n, int a) 
	    {
	        name = n;
	        age = a;
	    }

	    void displayPerson() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Employee extends Person                   //this is second class extending first class
	{
	    int empId;
	    double salary;

	    void getEmployeeDetails(int id, double sal) 
	    {
	        empId = id;
	        salary = sal;
	    }

	    void displayEmployee() 
	    {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Salary: " + salary);
	    }
	}

	class Manager extends Employee                       //this is third class extending second class
	{
	    String department;

	    void getManagerDetails(String dept) 
	    {
	        department = dept;
	    }

	    void displayManager()
	    {
	        System.out.println("Department: " + department);
	    }
	}

	public class Assignment_79 
	{
	    public static void main(String[] args) 
	    {

	        Manager m = new Manager();   //creating object of child class

	        m.getPersonDetails("Shalini", 25);
	        m.getEmployeeDetails(101, 75000);
	        m.getManagerDetails("IT");

	        m.displayPerson();
	        m.displayEmployee();
	        m.displayManager();
	    }
	}
	
	

