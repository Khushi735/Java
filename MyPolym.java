//wap to sort int array, long int array and double array
class Sorting
{
	void sort(int x[])
	{
		int i,j,t;
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(x[i] > x[j])
				{
					t=x[i];
					x[i]=x[j];
					x[j]=t;
				}
			}
		}
	}

void sort(double x[])
{
	int i,j;
	double t;
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(x[i] > x[j])
			{
				t=x[i];
				x[i]=x[j];
				x[j]=t;
			}
		}
	}
}
void sort(long x[])
{
	int i,j;
	long t;
	for(i=0; i<5; i++)
	{
		for(j=i+1; j<5; j++)
		{
			if(x[i]>x[j])
			{
				t=x[i];
				x[i]=x[j];
				x[j]=t;
			}
		}
	}
}}
public class MyPolym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,9,8,2,3};
		Sorting s=new Sorting();
		s.sort(a);
		
		for(int i=0;i<5;i++)
		{
			System.out.print(""+a[i]);
		}
		
		double b[]= {12.56,789.2,34.567,5.5,67.89};
		s.sort(b);
		System.out.print("\n");
		
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+b[i]);
		}
		
		long l[]= {4567781l,476435l,35679094l,342965l,7893544l,29435l};
		s.sort(l);
		System.out.print("\n");
		
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+l[i]);
		}

	}

}
