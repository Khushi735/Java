abstract class Vehical
{
	abstract void NoofWheels();
	abstract void Capacity();
	
}

class Bike extends Vehical
{
	void NoofWheels()
	{
		System.out.print("\n \n BIKE'S WHEELS:"+2);
	}
	void Capacity()
	{
		System.out.print("\n CAPACITY: "+2);
	}
}

abstract class Car extends Vehical
{
	void Noofwheels()
	{
		System.out.print("\n\n CAR'S WHEELS:"+4);
	}
}

abstract class Scorpio extends Car
{
	void capacity()
	{
		NoofWheels();
		System.out.print("\n CAPACITY:"+7);
	}
}
public class Myfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v;
 //=new Vehical(); as abstract can't be instrantiated
		Bike b=new Bike();
		b.NoofWheels();
		b.Capacity();
		
		Car c;
		Scorpio s = new Scorpio();
		s.Capacity();
	}

}
