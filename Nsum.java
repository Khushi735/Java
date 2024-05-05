
public class Nsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s=0;
		for(i=0;i<args.length;i++)
		{
			s=s+Integer.parseInt(args[i]);
			
		}
		System.out.print("\nSUM="+s);
	}

}
