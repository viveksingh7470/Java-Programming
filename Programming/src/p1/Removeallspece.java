package p1;
import java.util.Scanner;

public class Removeallspece 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		String t="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) !=' ')
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);

	}

}
