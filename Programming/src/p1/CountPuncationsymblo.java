package p1;

import java.util.Scanner;

public class CountPuncationsymblo 
{

	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='!' || s.charAt(i)==','|| s.charAt(i)==';'
					|| s.charAt(i)==':' || s.charAt(i)=='.'|| s.charAt(i)=='/'
					|| s.charAt(i)=='`' || s.charAt(i)=='~' || s.charAt(i)=='^')
			{
				
				count++;
			}
		}
		System.out.println("Total Number of Puncation character"+count);

	}

}
