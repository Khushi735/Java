class College1
{
	String cname;
	String city;
	
	College1(String cname, String city)
	{
		this.cname = cname;
		this.city = city;
		
	}
	
	void show()
	{
		System.out.print("\n Name:"+cname);
		System.out.print("City:"+city);
	}
	
}

class Student24 extends College1
{
	int sid, age;
	String sname;
	Student24(String cname, String city, int sid, int age , String sname)
	{
		super(cname,city);
		this.sid = sid;
		this.age = age;
		this.sname = sname;
		
	}
	
	void display()
	{
		show();
		
		System.out.print("\nStudent ID:"+sid);
		System.out.print("\nage:"+age);
		System.out.print("\nStudent name:"+sname);
	}

	
	
}
public class Svitvasad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student24 r1 = new Student24("SVIT" , "VASAD" , 87 , 19 , "khushi");
		r1.display();

	}

}
