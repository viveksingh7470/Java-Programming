package p1;

import java.util.Arrays;
import java.util.Scanner;

public class StarPattern 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1 :");
		String s=sc.nextLine();
		int n=s.length();
		String t=" ";
		t=t+(n*n+s+n);
		System.out.print(t);
		
	}
}
		

	

