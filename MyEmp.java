import java.util.Scanner;
import java.util.scanner;

class Employee
{
	int id;
	String name;
	double sal,tax;
	Scanner scan= new Scanner(System.in);


void input()
{
	System.out.print("\n ENTER ID - NAME - SALARY");
	id = scan.nextInt();
	name = scan.next();
	sal = scan.nextDouble();
	tax = sal*10;
}

void output()
{
	System.out.print("\n\n ID = "+id);
	System.out.print("\n NAME = "+name);
	System.out.print("\n SALARY ="+sal);
	System.out.print("\n TAX = "+tax);
}
}
public class MyEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.input();
		e1.output();
	}

}
