class Bank123

{

	String bname;

	String city;

	Bank123(String bname,String city)

	{

		this.bname=bname;

		this.city=city;

	}

	void show()

	{

		System.out.print("\n BANK NAME=  "+ bname);

		System.out.print("\n CITY NAME=  "+ city);

	}

}



interface atm

{

	int max_wid=2000;

	void disp();

}



class Customer extends Bank123 implements atm

{

	int id;

	String name;

	double balance;

	

	Customer(String bname,String city,int id,String name,double balance)

	{

		super(bname,city);

		this.id=id;

		this.name=name;

		this.balance=balance;

	}

	public void disp()

	{

		System.out.print("\n MAXIMUM WITHDRAWAL=  "+ max_wid);

		

	}

	void display()

	{

		disp();

		show();

		System.out.print("\n ID=  "+ id);

		System.out.print("\n NAME=  "+ name);

		System.out.print("\n BALANCE=  "+ balance);

		

	}

}

public class MyInterface {



	public static void main(String[] args) {

		Customer c1= new Customer("HDFC","VASAD",87,"KHUSHI",100000);

		c1.display();

	}



}