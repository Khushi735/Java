class College
{
	String cname;
	String area;
	
	College(String cname,String area)
	{
		this.cname = cname;
		this.area = area;
	}
	
	void show()
	{
		System.out.println("College name:"+cname);
		System.out.println("College area:"+area);
	}
}

interface canteen
{
	int price = 50;
	void display();
}

class Studenttts extends College implements canteen
{
	int id;
	String name;
	int age;
	
Studenttts(String cname,String area, int id, String name , int age)
{
	super(cname,area);
	this.id = id;
	this.name = name;
	this.age = age;
}

public void display()
{
	System.out.println("Price of dish="+price);
}

void output()
{
	display();
	show();
	System.out.println("ID:"+id);
	System.out.println("name:"+name);
	System.out.println("age:"+age);
}
	
}


public class MyInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenttts c1 = new Studenttts("SVIT" , "RAJUPURA" , 87 , "KHUSHI" , 19);
		c1.output();
	}

}
