import java.io.File;
import java.util.Scanner;

public class MyFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fon="", ext="";
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter folder name:");
		fon = scan.next();
		System.out.print("enter extension:");
		ext = scan.next();
		
		File h = new File(fon);
		
		String count[] = h.list();
		for(int i=0; i<count.length; i++)
		{
			if(count[i].endsWith(ext))
			{
				System.out.print("\n"+count[i]);
			}
		}
	}}

