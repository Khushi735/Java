import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,i,s=0;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Element:");
			n=scan.nextInt();
			
			int a[] = new int[n];
			
			for(i=0;i<a.length;i++)
			{
				System.out.print("Enter No");
				a[i]=scan.nextInt();
			}
		 //for(i=0;i<a.length;i++)
			//{
				//System.out.print(" "+a[i]);
				//s=s+a[i];
				//}
		for(int x:a)
		{
			System.out.print(" "+x);
			s=s+x;
		}
		System.out.print("\n SUM = " +s);
		}
	}


