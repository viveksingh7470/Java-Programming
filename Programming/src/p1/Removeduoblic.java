package p1;
import java.util.Scanner;

public class Removeduoblic 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		char ar[]= s.toCharArray();
		//sort
		for(int i=0; i<ar.length-1; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]<ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		String t="";
		for (int i=0; i<s.length(); i++)
		{
			t=t+ar[i];
		}
		String res="  ";
		for(int i=0; i<t.length()-1; i++)
		{
			if(t.charAt(i) != t.charAt(i=1))
			{
				res=res+t.charAt(i);
			}
			
		}
		res=res+t.charAt(t.length()-1);
		System.out.println(res);

	}

}
