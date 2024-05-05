class Vehical123
{
	int wheels;
	int cap;

  
Vehical123(int wheels, int cap)
{
	this.wheels = wheels;
	this.cap = cap;
}

void show()
{
	System.out.println("Wheels:"+wheels);
	System.out.println("capacity:"+cap);
}
}

interface speed
{
	int speed=300;
	void sped();
}

interface fly extends speed
{
	int height=5000;
	void flew();
}

class Plane extends Vehical123 implements fly
{
	int ahost;
	
	Plane(int wheels, int cap, int ahost)
	{
		super(wheels,cap);
		this.ahost = ahost;
		
	}
	public void sped()
	{
		System.out.println("Speed:"+speed);
	}
	
	public void flew()
	{
		System.out.println("Height:"+height);
	}
	
	void display()
	{
		show();
		sped();
		flew();
		System.out.println("No of airhost:"+ahost);
	}
}




public class MyInterface3 {

	public static void main(String[] args) {
		Plane p1=new Plane(2,5,10);
		p1.display();
		
	}

}
