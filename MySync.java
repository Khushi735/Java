class Call
{
	void movie(String user)
	{
		System.out.print("\n  "+user+" has started watching movie");
	try {Thread.sleep(3000);}
	catch(Exception e) {}
	System.out.print("\n      "+user+" has finished watching movie");
	
	}
	
	synchronized void interview(String user)
	{
		System.out.print("\n   "+user+ " has started giving interviews");
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		System.out.print("\n   "+user+" has finished giving interview");
	}
}
	
class Userr implements Runnable
{
	Thread th;
	String user;
	Call c;
	
	Userr(String user, Call c)
	{
		th = new Thread(this);
		this.c = c;
		this.user = user;
		th.start();
	}
	
	public void run()
	{
		c.movie(user);
		c.interview(user);
		
	}
}


public class MySync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Call c = new Call();
Userr u1 = new Userr("khushi",c);
Userr u2 = new Userr("Jenish", c);
	}

}
