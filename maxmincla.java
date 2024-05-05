//find max and min
public class maxmincla {
	public static void main(String[] args) {
		int a[]= new int[args.length];
		int i;
		for(i=0;i<args.length;i++)
		{
			a[i] = Integer.parseInt(args[i]);
		}
		int max=a[0];
		int min=a[0];
		
		for(int x:a)
		{
			if(x>max)
			{
				max = x;
			}
			if(x<min)
			{
				min=x;
			}
		}
		System.out.print("\n\nMAX="+max);
		System.out.print("\n\nMIN="+min);
	}
}
