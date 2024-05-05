
class Student
{
	int id,age;
	String name;
	
	
	
	Student(){}
		class Reesult
		{
			int M1,M2,M3;
			float total,percent;
			
			Reesult(int d, int e, String f, int a, int b, int c )
			
			{
				id=d;
				age=e;
				name = f;
			
				M1=a;
				M2=b;
				M3=c;
				
			}
			void display()
			{
			
			System.out.print("\n M1 ="+M1+"M2 ="+M2+"M3 ="+M3);
			}	
				
			}
			
	}

public class Marks {

	public static void main(String[] args) {
		Student.Reesult rr= new Student().new Reesult(22, 29, "hetbi" , 89, 90, 88);
		rr.display();
		

	}

}
