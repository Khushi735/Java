

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MyFile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f1,f2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER FILE NAME1:");
		f1=sc.next();
		System.out.println("ENTER FILE NAME2");
		f2=sc.next();
		
		try {
			FileReader fr = new FileReader("src//"+f1);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("src//"+f2);
			
			String line = "";
			
			while(line!=null)
			{
				line = br.readLine();
				if(line!=null)
				{
					fw.write(line+"\n");
				}
			}
			fr.close();
			fw.close();
			
		}
		catch(Exception e)
		{}
	}

}
