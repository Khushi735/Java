//WAP to make a game named snakes and ladders, 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
//ladder --> 7, 19, 31, 37
//snakes --> 9, 16, 23, 33, 40, 46, 49

class Board
{
	BufferedReader br;
	Random ra = new Random();
	
	synchronized int throwDice(String pna)
	{
		try {Thread.sleep(1000);}
		catch(Exception e) {}
		br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("\n \n "+pna+" -> press enter to throw dice:");
		try {br.read();}
		catch(Exception e) {}
		
	
	int dice = ra.nextInt(6);
	dice++;
	return dice;
	}
}

class Player1 implements Runnable
{
	Thread th;
	String pna;
	int score;
	Board b;
	
	
	Player1(String pna, Board b)
	{
		th = new Thread(this);
		score=0;
		this.pna = pna;
		this.b = b;
		th.start();
		
	}
	
public void run()
{
	while(true)
	{
		int dice = b.throwDice(pna);
		System.out.print("\n \n Previous Score = "+score+" Dice = "+dice);
		score+=dice;
		if(score==50)
		{
			System.out.print("\n \n     "+pna+"has won the game");
			System.exit(0);
		}
		else if(score>50)
		{
			score-=dice;
		}
		else if(score==7 || score==19 || score==31 || score==37)
		{
			System.out.print("\n \n " +pna+" has got the ladder");
			score+=5;
		}
		else if(score==9 || score==16 || score==23 || score==33 || score==40 || score==46 || score==49)
		{
			System.out.print("\n \n "+pna+" has been beaten by snake");
			score-=8;	
		}
		
		System.out.print("\n \n current score for "+pna+" is:");
	}
}
}
public class snake_ladders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b = new Board();
		
		Player1 p1 = new Player1("Khushi",b);
		Player1 p2 = new Player1("Jenish", b);
	}

}
