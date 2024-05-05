
class Emp
{
	int id;
	String name;
	
	Emp(int id , String name)
	{
	this.id = id;
	this.name = name;
	}


	void display()
	{
		System.out.print("\nId:"+id);
		System.out.print("\nname:"+name);
	}}
	
class Permanent extends Emp
{
	double salary;
	
	Permanent(int id , String name, double salary)
	{
		super(id , name);
		this.salary =salary;
	}
	
	void display()
	{
		super.display();
		System.out.print("\nsalary:"+salary);
		
	}
}

class Monthly extends Permanent
{
	double pf , net;
	
	Monthly(int id , String name, double salary)
	{
		super(id ,name , salary);
		pf = salary/100;
		net = salary - pf;
	}
	
	void display()
	{
		super.display();
		System.out.print("\npf:"+pf);
		System.out.print("\nnet:"+net);
	}
}

class Daily extends Permanent
{
	double hours, pay;
	
	Daily(int id , String name , double hours , double pay )
	{
		super(id ,name,hours*pay);	
		this.hours = hours;
		this.pay = pay;
	}
		
	
	
//	Daily(int id , String name);
//	{
//		super(int ,name);
//	}
	
	void display()
	{
		super.display();
	
		
	}
	
}





public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permanent b1 = new Permanent(23 , "khushi" , 300000);
		b1.display();
		
		Monthly b2 = new Monthly(22 , "Khushiii" , 300000);
		b2.display();
		
		Daily b3 = new Daily(25, "Khushiiiii" , 3 , 30000);
		b3.display();
	}

}
