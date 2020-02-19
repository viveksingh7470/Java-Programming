package p1;
import java.util.Scanner;

public class Removevcs
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		int v=0, cc=0, nc=0, scc=0, spec=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) =='a' 
					|| s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u'
					|| s.charAt(i) =='A' || s.charAt(i) =='E' || s.charAt(i) =='I' || s.charAt(i) =='O'
					|| s.charAt(i) =='U')
			{
				v++;
			}
			else
				if( s.charAt(i)>=97  && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=97)
				{
					cc++;
				}
				else
					if( s.charAt(i)>=48 && s.charAt(i)<=57)
					{
						nc++;
					}
					else
						if(s.charAt(i) ==' ')
						{
						scc++;
						}
						else
						{
							spec++;
						}
							
		
		}
		System.out.println(" Number: "+ nc);
		System.out.println(" consunent: "+ cc);
		System.out.println(" vowel: "+ v);
		System.out.println(" Spece: "+ spec);
	}
}