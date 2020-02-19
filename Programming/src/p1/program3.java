package p1;
import java.util.Scanner;

public class program3
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the N:");
		int n=sc.nextInt();
		int k=n-1;
		int c1=1, c2=n*n+1;
		for(int i=0; i<n ;i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("__");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print(c1++ +"* ");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print(c2+j);
				if(j<-i-1)
				{
					System.out.print("*");
				}
			}
			c2=c2-k;
			k--;
			System.out.println();
			
		}
	}

}
