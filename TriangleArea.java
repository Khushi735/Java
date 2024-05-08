//write a program to find area of triangle using OOPs.
//this the example of method
import java.util.Scanner;

class Elements
{
	double base,height,area;
	Scanner scan=new Scanner(System.in);
	
	void input()
	{
		System.out.print("\n Enter the value of Base");
		base = scan.nextInt();
		System.out.print("\n Enter the value of Height" );
		height = scan.nextInt(); 
		area = 0.5*base*height;
	}
	
	void output()
	{
		System.out.print("\n base ="+base);
		System.out.print("\n height ="+height);
		System.out.print("\n area ="+area);
	}
	
}
public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements e1 = new Elements();
		e1.input();
		e1.output();

	}

}
