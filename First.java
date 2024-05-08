import java.util.Scanner;

class Circle
{
	float pi=3.14f,rad,area;
	Scanner scan = new Scanner(System.in);
	void input()
	{
		System.out.print("Enter Radius:");
		rad = scan.nextFloat();
	}
	void show()
	{
		area=pi*rad*rad;
		System.out.print("\n RADIUS : "+rad);
		
	}
}



public class First {

	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.input();
		c.show();
		
	}

}
