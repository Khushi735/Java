class Daud implements Runnable
{
	Thread th;
	long miles=0;
	boolean bool=true;
	
	Daud(String user, int p)
	{
		th= new Thread(this);
		th.setPriority(p);
		miles= 0;
		bool = true;
		th.start();
	}
	
	public void run()
	{
		while(bool)
		{
			miles++;
		}
	}
	
	public void stop()
	{
		bool = false;
	}
			
}
public class MyPriority {

	public static void main(String[] args) {
		Daud d1 = new Daud("Khushi", 9);
		Daud d2 = new Daud("Jenish" , 2);
		
		try { Thread.sleep(1000);}
		catch(Exception e) {}
		d1.stop();
		d2.stop();
		
		System.out.println("Khushi's Daud:"+d1.miles);
		System.out.println("Jenish's Daud:"+d2.miles);
		
	}

}
