
import java.util.Scanner;

class stackk
{
	 int st[] = new  int[5];
	 int top,n;
	 
	 Scanner scan = new Scanner(System.in);
	 
	 stackk()
	 {
		top=-1;
			
	 }
	 void push()
	 {
			if(top==4)
			{
				System.out.print("\n STACK OVERFLOW");
			}
			else
			{
				System.out.print("\n ENTER THE VALUE");
				n=scan.nextInt();
				st[++top]=n;
			}
	 }
	 
	 void pop()
	 {
		 if(top== -1)
		 {
			 System.out.print("\n STACK UNDERFLOW");
		 }
		 else
		 {
			 n=st[top--];
			 System.out.print("\n POP : "+n);
		 }
	 }
	 
	 void display()
	 {
		 int i;
		 for(i=0;i<=top;i++)
		 {
				System.out.print("\n " + st[i]);
		 }
	 }
	 

}


public class MyStack {

	public static void main(String[] args) {
		
		
		int ch=0;
		Scanner scan1 = new Scanner(System.in);
		stackk s = new stackk();
		
		while(ch!=3)
		{
			System.out.print("\n \n STACK MENU ");
			System.out.print("\n 1. PUSH ");
			System.out.print("\n 2. POP ");
			System.out.print("\n 3. EXIT");
			System.out.print("\n 4. DISPLAY");
			System.out.print("\n SELECT THE OPTION=  ");
			ch = scan1.nextInt();
			
			switch(ch)
			{
			case 1: s.push(); 
			break;
			
			case 2: s.pop(); 
			break;
			
			case 4: s.display();
			break;
			}
		}
		
	}

}





