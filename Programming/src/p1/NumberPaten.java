package p1;

import java.util.Scanner;

public class NumberPaten 
{ 

	public static void main(String[] args) 
	{
		int c;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=1;i<=n; i++)
		{
			c=i*(i+1)/2;
			for(int j=1; j<=i; j++)
			{    
				
				System.out.print(c-- +" ");
				
			}
			System.out.println();
		}

	}

}
