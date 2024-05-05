import java.util.*;

class employee
{
	int id,salary;
	String name;
	float tax,net_salary;
	Scanner scan = new Scanner(System.in);
	
	void input()
	{
		System.out.print("Enter your Id no:");
		id = scan.nextInt();
		System.out.print("Enter your salary:");
		salary = scan.nextInt();
		System.out.print("Enter your name:");
		name = scan.next();
		
	}
	
	void show()
	{
		System.out.print("\n id:"+id);
		System.out.print("\n name:"+name);
		System.out.print("\n salary:"+salary);
		tax = (salary*10)/100;
		System.out.print("\nyour tax is:"+tax);
		net_salary = salary-tax;
		System.out.print("\nYour net salary is:"+net_salary);
	}
	
}
public class Myemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee c1 = new employee();
		
		c1.input();
		
		c1.show();
	}

}
