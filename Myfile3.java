//WAP to enter location and count total files and directories in that location.

import java.util.Scanner;

public class Myfile3 {

	
	String fna="";
	String ext;
	Scanner scan=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cont[]= f.list();
		int fi=0; foo=0;
		
		for(int i=0; i<cont.length; i++)
		{
			File ff = new File(fna, cont[i]);
			
			
			if(ff.isFile())
			{
				fi++;
				
			}
			
			else
			{
				foo++;
			}
		}
		System.out.print("Enter file name:"+fi);
		System.out.print("\n Total dirs:"+foo);		}

}

//hw : WAP to enter location and also enter bytes and list those files having more then given bytes
