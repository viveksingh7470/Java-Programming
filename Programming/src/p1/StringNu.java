package p1;
import java.util.*;
class  StringNu
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Any String");
		String a=sc.nextLine();
		int n= a.length();
		String t= " ";
		t= t+(n*n + a +n);
		System.out.println(t);
	}
}
