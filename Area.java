//write a program to find a area
import java.util.Scanner;

class Radius
{
	double rad,area;
	double pie=3.14;
	Scanner scan=new Scanner(System.in);
	
	void input()
	{
		System.out.print("\n Enter Radius");
		rad = scan.nextInt();
		area = 3.14*(rad*rad);
	}
	
	void output()
	{
		System.out.print("\n Radius ="+rad);
		System.out.print("\n Area="+area);
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radius e1 = new Radius();
		e1.input();
		e1.output();
	}

}
