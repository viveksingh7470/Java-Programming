package p1;
import java.util.*;
class ZigZag 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the array size ");
		int n=sc.nextInt();
		int ar1[] = new int [n];
		System.out.println("Enter the element of array");
		for (int i=0 ;i<ar1.length ;i++ )
		{
			ar1[i] =sc.nextInt();		
		}
		System.out.println("Enter the array2 size");
		int m=sc.nextInt();
		int ar2[]=new int [m];
		System.out.println("Enter the array2 element");
		for (int i=0 ;i<ar2.length ;i++ )
		{
			ar2[i]=sc.nextInt();
		}
			int res[]=new int [ar1.length + ar2.length];
			int max=0;
			if (ar1.length > ar2.length)
			{
				max=ar1.length;
			}
			else
		{
				max=ar2.length;
		}
		int j=0;
		for (int i=0 ;i<max ;i++ )
		{
			if (i<ar1.length)
			{
				res[j] =ar1[i];
				j++;
			}
				if (i<ar2.length)
				{
					res[j]=ar2[i];
					j++;
				}
		}
		for (int i=0 ;i<res.length ;i++ )
		{
			System.out.print(res[i] + "  ");
		}
	}
}
