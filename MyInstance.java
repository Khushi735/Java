class Parentt
{
	void show()
	{
		System.out.print("\n I AM IN SHOW OF PARENT");
	}
}

//class gulli
//{
	
//}

class child extends Parentt{
	void display()
	{
		System.out.print("\nI AM IN DISPLAY OF CHILD");
			
	}
}
public class MyInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentt p=new Parentt();
		if(p instanceof Parentt)
		{
			System.out.print("\n P has copy of Parent");
		}
		else 
		{
			System.out.print("\n P doesn't have copy of parent");
		}
		if(p instanceof child)
			{
			System.out.print("\n P has copy of child ");
			
			}
		else 
		{
			System.out.print("\n P doesn't have copy of child");
		}
		
		child c=new child();
		if(c instanceof child)
		{
			System.out.print("\n C HAS COPY OF CHILD");
		}
		else
		{
			System.out.print("\n C DOESN'T HAVE COPY OF CHILD");
		}
		
		if(c instanceof Parentt)
				{
			System.out.print("\n C HAS COPY OF PARENT");
				}
		else
		{
			System.out.print("\n C DOESN'T HAVE COPY OF PARENT");
		}
		
		
		
		
		
		
}}
