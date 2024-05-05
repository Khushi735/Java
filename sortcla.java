
public class sortcla {
	public static void main(String[] args) {
		int a[]= new int[args.length];
		int i,j,temp=0;
		for(i=0;i<args.length;i++)
		{
			a[i] = Integer.parseInt(args[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		
		
		
		
	}
	

}
