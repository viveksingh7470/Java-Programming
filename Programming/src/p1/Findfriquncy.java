package p1;
import java.util.Scanner;

public class Findfriquncy 
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
	int c=1;
	for(int i=0; i<t.length()-1; i++)
	{
		
		if(t.charAt(i)==t.charAt(i+1))
		{
			c++;
		}
		else
			System.out.println(t.charAt(i)+ "="+c);
		     c=1;
	}
	System.out.println(t.charAt(t.length()-1)+"="+c);
	
   }
}
