package p1;

import java.util.Scanner;
class Guesser
{
	int gnum;
	int guessNum()
	{
		System.out.println("Guesser! Kindly guess a number:");
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		return gnum;
	}
}

class Player
{
	int pnum;
	int guessNum1()
	{
		System.out.println("Player! Kindly guess a number:");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
	}
}

class Umpire
{
	int count;
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectGuesserNum()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		numFromGuesser = g.guessNum();
	}

	void collectPlayerNum()
	{
		
			Player p1 = new Player();
			numFromPlayer1 = p1.guessNum1();

			Player p2 = new Player();
			numFromPlayer2 = p2.guessNum1();

			Player p3 = new Player();
			numFromPlayer3 = p3.guessNum1();
		
	}

	int compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player 1 Won! with "+count+" starts!!");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player 2 Won! with "+count+" starts!!");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 Won! with "+count+" starts!!");
		}
		else
		{
			System.out.println("Game Lost! Please try again!");
		}
		return numFromGuesser;
	}
}

class  GuesserGame
{
	public static void main(String[] args) 
	{
		Umpire u = new Umpire();
		
		u.collectGuesserNum();
		int c=0;
		while(c !=1)
		{
		u.collectPlayerNum();
		
			
		}
		 c=u.compare();
		}
}