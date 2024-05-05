abstract class Shape
{
	abstract void area();
	abstract void Volume();
}

class Circle1111 extends Shape
{
	
	void area()
	{
		System.out.println("Area of Circle:3.14*r*r");
	}
	void volume()
	{
		
	}
	@Override
	void Volume() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Box extends Shape
{
	void area()
	{
		System.out.println("Area of box:l*b");
	}
}
class Boxx3d extends Box
{
	void volume()
	{
		System.out.println("Volume of box is : l*b*h");
	}

	@Override
	void Volume() {
		// TODO Auto-generated method stub
		
	}
}

public class Shapeabst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1111 c1 = new Circle1111();
		c1.area();
		c1.volume();
		
		Boxx3d c2 = new Boxx3d();
		c2.area();
		c2.volume();
		
	}
}

