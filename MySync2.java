class Call1
{
	void read(String user)
	{
		System.out.print("\n  "+user+" can read");
	try {Thread.sleep(3000);}
	catch(Exception e) {}	
	System.out.print("\n  "+user+" stop reading");
}

	synchronized void edit(String user)
	{
		System.out.print("\n   "+user+ " can edit");
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		System.out.print("\n   "+user+ " stop editing");
	}
}

class Stu implements Runnable
{
	Thread th;
	String user;
	Call1 c;
	
	Stu(String user, Call1 c)
	{
		th = new Thread(this);
		this.c = c;
		this.user = user;
		th.start();
	}
	
	public void run()
	{
		c.read(user);
		c.edit(user);
		
	}
}
public class MySync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call1 c = new Call1();
		Stu u1 = new Stu("khushi",c);
		Stu u2 = new Stu("Jenish", c);
			}
	}


