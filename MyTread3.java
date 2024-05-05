class Chilld implements Runnable
{
	Thread th;
	int i,n;
	
	Chilld(int n)
	{
		th = new Thread(this);
		this.n = n;
		
		th.start();
	}
	
	public void run()
	{
		for(i=n;i<n+10;i++)
		{
			System.out.print("\n"+i);
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
			

	}
}
public class MyTread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chilld c1=new Chilld(1);
		try{c1.th.join();}
		catch(Exception e) {}
		
		
		
		Chilld c2=new Chilld(11);
		try{c2.th.join();}
		catch(Exception e) {}
		
		Chilld c3=new Chilld(21);}

}
