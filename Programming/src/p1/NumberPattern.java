package p1;

import java.util.Scanner;

public class NumberPattern 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=scan.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+1);
			}
			for(int j=1; j<=n; j++)
			{
				System.out.print(i);
			}
			if(i%2 !=0)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}

	}

}
