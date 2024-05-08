class Book
{
	String bookname,author;
	int	 prize,discount;
	
	Book(String bookname,String author,int prize)
	{
		this.bookname = bookname;
		this.author = author;
		this.prize= prize;
		
		
	}
	
	void show()
	{
		int x;
		System.out.print("Book name ="+bookname);
		System.out.print("author name ="+author);
		System.out.print("prize of book ="+prize*10/100);
		//System.out.print("\n       THIS    =   "+this);
		
	}
	
	//public String toString()
	//{
	//	return "\n khushi Prajapati"+bookname+","+author;
	//}
	
	
	
	void show(String bookname,String author,float prize,float d)
	{}
	
}
public class Libarary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("IKIGAI", "IDK", 200 );
		Book b2 = new Book("C++", "k", 2000 );
		Book b3 = new Book("IGAI", "IK", 20 );
		b1.show();
		b2.show();
		b3.show();
	}

}
