class Player
{
	String country;
	String Pname;
	
	Player(String country, String Pname)
	{
		this.country = country;
		this.Pname = Pname;
	}
	
	void display()
	{
		System.out.print("\nCountry:"+country);;
		System.out.print("\nPlayer name:"+Pname);
	}
	
	
}


class Batsman extends Player
{
	int runs, cents;
	Batsman(String country , String Pname , int runs , int cents)
	{
		super(country , Pname);
		this.runs = runs;
		this.cents = cents;
	}
	
	void show()
	{
		display();
		System.out.print("\nruns:"+runs);
		System.out.print("\ncents:"+cents);
	}
}


class Bowler extends Batsman
{
	int overs , wikets;
	Bowler(String country , String Pname , int runs ,int cents , int overs, int wikets)
	{
		super(country,Pname ,runs , cents);
		this.overs = overs;
		this.wikets = wikets;
	}
	
	void show()
	{
		super.show();
		System.out.print("\novers:"+overs);
		System.out.print("\nwikets:"+wikets);
		
	}
}
public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bowler s1 = new Bowler("India" , "Kohli" , 100 , 1 , 2 , 2);
		s1.show();
	}

}
