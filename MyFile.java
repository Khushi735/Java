import java.io.File;
import java.sql.Date;
import java.util.Scanner;


public class MyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fna="";
		Scanner scan=new Scanner(System.in);
		
		
		//System.out.print("enter file name:");
		//fna = scan.next();
		// File file = new File("src//"+fna);
//		File file = new File("src//MySync.java");
//		
//		System.out.print("\n EXISTS: "+file.exists());
//		System.out.print("\n EXISTS: "+file.length());
//		System.out.print("\n EXISTS: "+file.getName());
//		System.out.print("\n EXISTS: "+file.getAbsolutePath());
//		System.out.print("\n EXISTS: "+file.canRead());
//		System.out.print("\n EXISTS: "+file.canWrite());
//		
//		long l=file.lastModified();
//		System.out.print("\n LAST MODIFIED :"+l);
//		Date dd = new Date(l);
//		
//		
//		System.out.print("\n LAST MODIFIED :" +dd );
//		
//		System.out.print("\n IS IT FILE:"+file.isFile());
//		System.out.print("\n IS IT DIR:"+file.isDirectory());
		
		//File f = new File("src//london");
		//f.mkdir();
		//f.mkdirs(); used to create multiple directories
		

		
		System.out.print("Enter file name:");
		fna = scan.next();


		File f = new File(fna);
		String count[] = f.list();

		for(int i=0; i<count.length; i++)
		{
			System.out.print("\n"+count[i]);
		}}}


