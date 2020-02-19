package p1;
import java.util.Scanner;

public class Sswap
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  String:");
		String s=sc.nextLine();
		char ar[]=s.toCharArray();
		//sort
		for(int i=0; i<ar.length-1; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
				    ar[j]=t;	
				}
			}
		}
		String t="";
		for(int i=0; i<ar.length-1; i++)
		{
			t=t+ar[i];
		}
		System.out.print(t);
	}

}
