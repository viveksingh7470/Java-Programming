package p1;

import java.util.Scanner;

public class NumberPatter 
{

	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=2;i<=2*n; i=i+2)
		{
			System.out.print(i);
			if(i<=2*n-1)
			{
				System.out.print(",");
			}
			
		}
		System.out.println();

	}

}

