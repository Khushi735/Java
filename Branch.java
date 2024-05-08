//class bank which contains id,name,ob,dp,vd,cb. Creat two object in 1st object pass id,name,op,dp,vd in 2nd object pass only id,name and ob all other,
class Bank
{
	double ob,dp,wd,cb;
	int id;
	String name;
	
	Bank(double a,double b,double c,int i, String n)
	{
	ob = a;
	dp = b;
	wd = c;
	id = i;
	name = n;
	}
	Bank(int i, String n, double a)
	{
	id = i;
	name = n;
	ob = a;
	}
	
	void show()
	{
		System.out.print("\nopening balance:"+ob);
		System.out.print("\ndeposite:"+dp);
		System.out.print("\nwidwl:"+wd);
		System.out.print("\nclosing balance:"+(ob+dp-wd));
		System.out.print("\nid:"+id);
		System.out.print("\nname:"+name);	
	}
	
	
		
	
}
public class Branch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1= new Bank(1000,100,50,80,"khushi");
		b1.show();
		Bank b2 = new Bank(80,"khushi",1000);
		b2.show();
	}

}
