package p1;
import java.util.Scanner;
class Consunet 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	
		int count=0;
		int vc=0;
		for (int i=0 ;i<s.length();i++)
		{
			if (s.charAt(i) =='a'|| s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
			|| s.charAt(i) == 'A'
			|| s.charAt(i) == 'E'
			|| s.charAt(i) == 'I'
			|| s.charAt(i) == 'O'
			|| s.charAt(i) == 'U')
			{
		
			vc++;
			}
			
		    else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' ) 
                
			{
			
			count++;
			}
		}
			
		System.out.println(" Consunent" +count);
		
	
}
}