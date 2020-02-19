package p1;
import java.util.*;

class Friquece 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char ar[]=s.toCharArray();
		for (int i=0 ;i<ar.length ;i++ )
		{
			for (int j=i+1;j<ar.length ;j++ )
			{
				if (ar[i] >ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		String t=" ";
		for (int i=0 ;i<t.length()-1 ;i++ )
		{
		 t=t+ar[i];
		}
		int c=1;
		for (int i=0;i<t.length()-1 ;i++ )
		{
			if ( t.charAt(i) == t.charAt(i+1))
			{
				c++;
			}
			else
				System.out.println(t.charAt(i)+"="+c);
		}
		System.out.println(t.charAt(c)-1+"="+c);
	}
}
		
		