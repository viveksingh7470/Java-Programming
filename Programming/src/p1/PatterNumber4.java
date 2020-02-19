package p1;

import java.util.Scanner;

public class PatterNumber4 
{

	public static void main(String[] args) 
	{

		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter the N:");
		int n=scan.nextInt();
		for (int i = 1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
				/*
				 * Scond formula
				 if(i%2)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
				 */
			{
				System.out.print(i%2);
			}
			System.out.println();
		}

	}

}
