package p1;
import java.util.*;
class  NumberPartter1
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the N:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for (int i=1 ;i<n ;i++ )
		{
			if (i%2 == 0)
			{
				System.out.print(i+1+" ");
			}
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(i+" ");
			}
			if (i%2 !=0)
			{
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
	}
}
