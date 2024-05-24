//WAP to read the contain of file line by line.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Myfile4{
	
	public static void main(String[] args) {
		
		String f1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER FILE NAME:");
		f1= sc.next();
		
		try {
			FileReader fr = new FileReader("src//"+f1);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while(line!=null) //null means end of file
			{
				line = br.readLine();
				if(line != null)
				{
				System.out.print("/n"+line);
				}
			}
			fr.close();
		}
		catch(Exception e)
		{
			
		}
	}
}