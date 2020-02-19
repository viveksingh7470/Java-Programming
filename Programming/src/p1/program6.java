package p1;
import java.util.Scanner;

public class program6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
		int c=1;
		for (int i=0;i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(c+j +" ");
			}
			System.out.println();
			if (n/2  == 0 && i==n/2)
			{
				c=c-n;
			}
			else if(n/2 == 0 && i== n/2-1)
			{  
				c=c+n; 
			}  
			
			else if(i >=n/2)
			{
				c=c-2*n;
			}
			else
			{
				c= c+2*n;
			}

		}

	}

}
