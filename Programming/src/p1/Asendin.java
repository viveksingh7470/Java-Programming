package p1;
import java.util.Scanner;
 class  Asendin
{
	public static void main(String[] args) 
	{
		int n;
		int c=0;
		System.out.println(" Enter the Any Number");
		Scanner sc=new Scanner (System.in);
		n =sc.nextInt();
		  for (int i=1 ;i<=n ;i++ )
		{
			if (i%2==0)
			{
				c=i*(i+1)/2;
				for (int j=1 ;j<=i ;j++ )
				{ 
					System.out.print(c-j+1 +" ");
				}
				
				{
					for (int j=1 ;j<=i ;j++ )
					{
						System.out.print(c + j+" ");
					}
				}
				System.out.println();
			}
		}
	}
}
