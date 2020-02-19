package p1;

public class Exam2 
{

	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2=new String(s1);
		String s3="Hello";
		System.out.println((s1==s2)+" "+s1.equals(s2));//false,true
		{
			System.out.println(s1.equals(s2)+" "+s2.equals(s3));
			//true true
		}

	}

}
