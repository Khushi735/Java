class rect{
	int len,wid;
	
	rect(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	
	void show()
	{
		System.out.print("\n Length: "+len);
		System.out.print("\n Width: "+wid);
		
	}
	
	int area()
	{
		return len*wid;
	}
}

//class child extends parent
class rect3d extends rect
{
	int height;
	rect3d(int len,int wid,int height)
	{
		//super ke upar kuch naiiii !!!!!!!!
		super(len,wid); // it calls constructor of parent class
		this.height=height;
	}
	
	void display()
	{
		show();
		System.out.print("\nHeight: "+height);
		System.out.print("\n Area: "+area());
		System.out.print("\n Volume: "+height*area());
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
	
	rect3d r1 = new rect3d(10,20,30);	
	r1.display();
		
	}

}