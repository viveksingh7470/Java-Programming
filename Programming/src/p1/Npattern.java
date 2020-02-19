package p1;

import java.util.Scanner;

public class Npattern 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N :");
		int n=scan.nextInt();
		int c=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
			c=i*(i+1)/2;
			for(int j=1; j<=i; j++)
			{
				System.out.print(c-j+1);
			}
			}
			else
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(c+j);
				}
			}
			System.out.println();
		}
	}

}
