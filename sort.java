import java.util.Scanner;
public class sort {

	public static void main(String[] args) {
		int i,j,temp;
		Scanner scan = new Scanner(System.in);
		
		int a[]= new int[5];
		for(i=0;i<a.length;i++)
		{
			System.out.print("\n Enter the number:");
			a[i]=scan.nextInt();
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
		for(int x:a)
		{
			System.out.print(" "+x);
		}
	}

}
