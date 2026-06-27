//Write a Program for hierarchical Level Inheritance

package assignment.module1;

class  Flowers               //Parent class
{
	void color()
	{
		System.out.println("Flowers are colorful");
	}
}
class  Rose extends Flowers            //first child  class
{
	void red()
	{
		System.out.println("Roses are red in color");
	}
}
class  Lotus extends Flowers               //second child  class
{
	void nat()
	{
		System.out.println("Lotus is national flower of India");
	}
}

public class Assignment_87 {

	public static void main(String[] args) 
	{
		Lotus l =new Lotus();
		Rose r=new Rose();
		
		l.nat();
		r.red();
		r.color();

	}

}
