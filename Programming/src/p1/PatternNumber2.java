package p1;

import java.util.Scanner;

public class PatternNumber2
{

	public static void main(String[] args) 
	{

		int c=1;
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter the N:");
		int n=scan.nextInt();
		for (int i = 1; i<=n; i++)
		{
			c=i*n;
			for(int j=1; j<=n; j++)
			{
				if(c<10)
				{
					System.out.print(0);
				}
				System.out.print(c--+" ");
				
			}
			System.out.println();
		}

	}

}
