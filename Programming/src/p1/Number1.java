package p1;

import java.util.Scanner;

public class Number1 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=0;i<=n; i++)
		{
			for(int j=0;j<n-i; j++)
			{
				System.out.print(n-i);
			}
			System.out.println();
		}

	}

}
