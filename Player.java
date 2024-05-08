//write a program to create class cricket which contains player name, country name and runs.
import java.util.Scanner;

class Info
{
	String name,country_name;
	int runs;
	Scanner scan=new Scanner(System.in);

	void input()
	{
		System.out.print("\n Enter the name of the player: ");
		name = scan.next();
		System.out.print("\n Enter the country name of the player: ");
		country_name = scan.next();
		System.out.print("\n ENter the runs of that player: ");
		runs = scan.nextInt();
	}
	
	void output()
	{
		System.out.print("name of the player ="+name);
		System.out.print("\nname of the player's country= "+country_name);
		System.out.print("\nEnter the runs by that player:"+runs);
	}
}
public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info e1 = new Info();
		e1.input();
		e1.output();
		}

}


