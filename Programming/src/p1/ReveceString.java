package p1;

import java.util.Scanner;

public class ReveceString 
{

	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("ENter the  String");
		//String x=sc.nextLine();
		String x="ABC tech";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			++i;
		}
		System.out.println(y);
		System.out.println(a);

	}

}
