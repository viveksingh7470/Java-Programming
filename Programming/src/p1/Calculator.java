package p1;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a N:");
		int a=sc.nextInt();
		System.out.println("Enter the b N:");
		int b=sc.nextInt();
		int add=0,mull=0,div=0,sub=0;
		add=a+b;
		sub=a-b;
		mull=a*b;
		div=a/b;
		System.out.println("Addition :"+add);
		System.out.println("Subtraction :"+sub);
		System.out.println("Multiplication :"+mull);
		System.out.println("Division :"+div);
	}

}
