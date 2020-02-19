package p1;

import java.util.Scanner;

public class NumberPattern5
{

	public static void main(String[] args) 
	{
		int res=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=1;i<=n; i++)
		{
			
			res=res+i;
			System.out.print(res+" ");
			System.out.print(",");
		}
	}

}
