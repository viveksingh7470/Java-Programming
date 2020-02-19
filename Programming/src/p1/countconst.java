package p1;
import java.util.Scanner;

public class countconst
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		int count=0 , v=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) =='a' 
					|| s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u'
					|| s.charAt(i) =='A' || s.charAt(i) =='E' || s.charAt(i) =='I' || s.charAt(i) =='O'
					|| s.charAt(i) =='U')
			{
				v++;
			}
		else if( s.charAt(i)>=97  && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=97)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}

