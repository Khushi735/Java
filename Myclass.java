import java.util.*;

class student1
{
	int age,id, mark1, mark2, mark3;
	String name;
	float total,percent;
	Scanner scan = new Scanner(System.in);
	
	void input()
	{
		System.out.print("Enter your age:");
		age = scan.nextInt();
		System.out.print("\nEnter your Id number:");
		id = scan.nextInt();
		System.out.print("\nEnter your name:");
		name = scan.next();
		System.out.print("\nEnter your marks 1:");
		mark1 = scan.nextInt();
		System.out.print("Enter your marks 2:");
		mark2 = scan.nextInt();
		System.out.print("Enter your marks 3:");
		mark3 = scan.nextInt();
		
		
		
		
		
	}
	
	void show()
	{
		System.out.print("\n age:"+age);
		System.out.print("\n id:"+id);
		System.out.print("\n mark1:"+mark1);
		System.out.print("\n mark2:"+mark2);
		System.out.print("\n mark3:"+mark3);
		total = mark1+mark2+mark3;
		System.out.print("\n total:"+total);
		percent = total/3;
		System.out.print("\n Percent:"+percent);
	}
	
}
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 c1 = new student1();
		student1 c2 = new student1();
		
		c1.input();
		
		
		c1.show();
		
	}

}
