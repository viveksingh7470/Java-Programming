package p1;

import java.util.Scanner;

public class PatternSecond 
{

	public static void main(String[] args)
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}
		System.out.println();

	}

}
