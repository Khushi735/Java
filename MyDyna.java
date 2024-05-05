class Base
{
	void show()
	{
		System.out.println("I am in show of base.");
	}
	void Display()
	{
		
	}
}

class Derived extends Base
{
	void Display()
	{
		super.show();
		System.out.println("I am in display of derieved.");
	}
}
public class MyDyna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d1 = new Derived();
		System.out.println("\n\n USING OBJECT OF DERIVED...");
		d1.show();
		d1.Display();
		
		Base b1 = new Base();
		System.out.println("\n\n USING OBJECT OF BASED....");
		b1.show();
		//b1.Display(
;		
		Base b=new Derived();
		System.out.print("\n\n USING DYNAMIC METHOD DISPLATCHED");
		b.show();
		b.Display();
	}

}
