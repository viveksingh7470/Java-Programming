package p1;

import java.util.Scanner;

public class InpuHCF 
{

	public static void main(String[] args) 
	{

		int a[]=new int[5];
		int hcf=0;	

		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5; i++)
		{
			System.out.println("Enter the array no:");
			 a[i]=scan.nextInt();			 
		}		 
		int size = a.length;
	      int result = a[0];
	      int i = 1;
		while(i<size)
	      {
	         if(a[i]%result==0)
	         {
	            i++;
	         } else {
	            result = a[i]%result;
	            i++;
	         }
	      }
	      System.out.println("GCD is "+result);
	}
}
