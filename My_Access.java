class access
{
	int pub,pri,pro,modi;
	access(int pub, int pri, int pro, int modi)
	{
		this.pub = pub;
		this.pri = pri;
		this.pro= pro;
		this.modi = modi;
	}
	
	void show()
	{
		System.out.println("Public:"+pub+"\nPrivet:"+pri+"\nprotected:"+pro+"\nmodifiers:"+modi);
	}
}
public class My_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access p1=new access(10,20,30,40);
		p1.show();
	}

}
