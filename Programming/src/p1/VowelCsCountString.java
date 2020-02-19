package p1;

import java.util.Scanner;

public class VowelCsCountString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Anym String ");
		String x=sc.nextLine();
		char y[]=x.toCharArray();
		int size= y.length;
		int vowel=0;
		int consts=0;
		int special=0;
		int i=0;
		while(i!=size)
		{
			if(y[i]>='A'&& y[i]<='Z' || y[i]>='a'&& y[i]<='z')
			{
				if(y[i]=='A' || y[i]=='E'|| y[i]=='I' || y[i]=='O'
					|| y[i]=='U' ||y[i]=='a' || y[i]=='e'|| y[i]=='i' || y[i]=='o' || y[i]=='u')
				{
					++vowel;
				}
				else
				{
					++consts;
				}
				
				}
				else
				{
					
						++special;
					}
					++i;
				}
				System.out.println(y);
				System.out.println("Vowel ="+vowel);
				System.out.println(" Consunent"+consts);
				System.out.println("Spwcial Symble "+ special);
			}
			
	
		}

