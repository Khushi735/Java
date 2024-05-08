class Box //class
{
	int len,wid,area;
	
	Box()   //default constructor
	{
	len = 0;
	wid = 0;
	}
	
	Box(int l,int w)   //default constructor
	{
	len = l;
	wid = w;
	}
	
	Box(int l) //parametrised constructor
	{
	len = 1;
	wid = 1;
	}
	
	void Box()
	{
		
	}
	
	void show() //method
	{
		System.out.print("\n \n length ="+len);
		System.out.print("\n width ="+wid);
		area = len*wid;
		System.out.print("\n AREA="+area);
	}
	
	void show(int a)
	{}
	void show(char b)
	{}
	void show(float x)
	{}
	void show(int a, int b)
	{}
}
public class MyBox {

	public static void main(String[] args) 
	{
		//b1 is reference variable
		//new box(); is an object
		
		Box b1 = new Box();
		Box b2 = new Box(100);
		Box b3 = new Box();
		Box b4 = new Box(5,6);
		
		b1.show();
		b2.show();
		b3.show();
		
		b1.show();
		b4.show();
		
		
	}

}
