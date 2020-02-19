package p1;
import java.util.Scanner;

public class Sprogram2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=0;
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i) == ' ')
			{
				count ++;
			}
				
		}
		System.out.println(count+1);

	}

}
