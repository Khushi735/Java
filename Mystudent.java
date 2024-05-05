import java.util.*;

class Vidhyarthi
{
	int id;
	String name;
	int m1,m2,m3,tot,per;
	
	Vidhyarthi(int a,String b,int c,int d,int e)
	{
		id=a;
		name=b;
		m1=c;
		m2=d;
		m3=e;
		
	}
	Vidhyarthi(int a,String b)
	{
		id =a;
		name = b;
		m1=0; m2=0 ; m3=0;
	}
	
	void show() {
		System.out.print("\n ID : "+id+" , name="+name);
		System.out.print("\n MARKS : "+m1+","+m2+","+m3);
				
		
	}
}
public class Mystudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vidhyarthi c1 = new Vidhyarthi(77 , "khushi" , 77, 88,99);
		
		c1.show();
	}

}
