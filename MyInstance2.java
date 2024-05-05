import java.util.Random;



public class MyInstance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Random ra = new Random();
		
		for(i=1;i<=10000000;i++)
		{
			int n = ra.nextInt(6);
			n++;
			System.out.print("\n"+n);
		}
	}

}
