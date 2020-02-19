package p1;

import java.util.Scanner;

public class NumberPattern2 
{

	public static void main(String[] args) 
	{
		int c=15;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0;i<n; i++)
		{
			for (int j = 0; j <=i; j++)
			{
				
				System.out.print(c--+" ");
				
			}
			System.out.println();
		}

	}

}
