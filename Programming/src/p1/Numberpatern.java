package p1;

import java.util.Scanner;

public class Numberpatern {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		int c=n*(n+1)/2;
		for(int i=0;i<n; i++)
		{
			for (int j = 0; j <=i; j++)
			{
				
				System.out.print(c--+" ");
				if(j<=i-1)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
