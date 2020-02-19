package p1;

import java.util.Scanner;

public class DublicatChar 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String nw="";
		System.out.println("original+"+ s);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			
				nw=nw+ch;
				s=s.replace(ch,' ');
		}
			System.out.print(nw);
		
				

	}

}
