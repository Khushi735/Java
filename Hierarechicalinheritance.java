class Bank								//ye parent class hai
{
	String bname;
	String Area;
	
	Bank(String bname , String Area)
	{
		this.bname = bname;
		this.Area = Area;								
	}
	
	void display()
	{
		System.out.print("\nBank name:"+bname);
		System.out.print("\nArea:"+Area);
	}
}




class Currentacc extends Bank				//ye parent class ka pehla child hai usme hamne display use kiya hai
{
	double openingbal , balance , wid , closing;
	Currentacc(String bname , String Area, double openingbal ,double balance ,double wid)
	{
		super(bname , Area);
		this.openingbal = openingbal;
		this.balance = balance;
		this.wid = wid;
		
	}
	
	void show()
	{
		super.display();
		System.out.print("\nOpening balance:"+openingbal);
		System.out.print("\nBalance:"+balance);
		System.out.print("\nWithdraw:"+wid);
		closing = openingbal - wid;
		System.out.print("\nClosing balance is:"+closing);
	}
}


class Fixeddepo extends Bank
{
	double amt , year , rate , intrest ,mat_amt;
	Fixeddepo(String bname , String Area,double amt , double year , double rate)
	{
		super(bname, Area);
		this.amt = amt;
		this.year = year;
		this.rate = rate;
	}
	
	void show()
	{
		super.display();
		System.out.print("\namount:"+amt);
		System.out.print("\nyear:"+year);
		System.out.print("\nrate:"+rate);
		intrest = (amt*year*rate)/100;
		System.out.print("\nIntrest:"+intrest);
		mat_amt = amt + intrest;
		System.out.print("\nMaturity amount:"+mat_amt);
		
	}
}

public class Hierarechicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Currentacc b1 = new Currentacc("HDFC" , "amit nagar" , 20000 , 6700 , 5334);
			b1.show();
    Fixeddepo s1 = new Fixeddepo("HDFC" , "amit nagar" , 100000 , 2 , 5);
    		s1.show();
    
    
	}

}




















class Com extends Emp
{
	double sales , comission;
	
	Com(double sales)
	{
		super(id ,name , sales);
		
		
	}
}
