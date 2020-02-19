package p1;

import java.util.Scanner;

public class Pattern4 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0;j<n; j++)
			{
				System.out.print("*");
			}
			//***************
			for(int j=0; j<=i; j++)
			{
				System.out.print("@");
			}
			for(int j=0; j<=i+j; j++)
			{
				System.out.print("0");
			}
			System.out.println();
		}
		
	}
}