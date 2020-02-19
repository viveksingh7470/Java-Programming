package p1;

import java.util.Scanner;

public class CountVowelConSpe 
{

	public static void main(String[] args) 
	{
		int vc=0,co=0,scc=0,spc=0,nc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'
					||s.charAt(i)=='i' || s.charAt(i)=='o'
					||s.charAt(i)=='u' || s.charAt(i)=='A'
					||s.charAt(i)=='E' || s.charAt(i)=='I'
					||s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				vc++;
				
			}
			else
			{
				if(s.charAt(i)>97 && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=90)
				{
					co++;
					

				}
				else
				{
					if(s.charAt(i)>=48 && s.charAt(i)<=57)
					{
						nc++;
					

					}
					else
					{
						if(s.charAt(i)==' ')
						{
							scc++;
							

						}
						else
						{
							spc++;
							

						}
						
					}
				}
			}
			
				
		}
		System.out.println("Spece"+spc+" Vowel"+vc+" Consunent"+co+" No of Charcter"
				+nc+"Special Charchater"+scc);

	}

}
