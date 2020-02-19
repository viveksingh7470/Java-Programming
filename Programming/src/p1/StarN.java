package p1;
import java.util.Scanner;
class StarN 
{
	public static void main(String[] args) 
	{
		int n = 0, k=n-1, c1=1, c2=n*n+1;
		System.out.println(" Enter the Any Number");
		Scanner sc=new Scanner (System.in);
		n =sc.nextInt();
		for (int i=0 ;i<n ;i++ )
		{
			for (int j=0 ;j<i ;j++ )
			{
				System.out.print("_ _");
			}
			for (int j=0;j<n-i ;j++ )
			{
				System.out.print(c1++ +" ");
			}
			for (int j=0 ;j<n-i ;j++ )
			{
				System.out.print(c2+j);
				if (j<i-1)
				{
					System.out.print("*");
				}
			}
			c2=c2-k;
			k--;
		}
		System.out.println();
	}
}