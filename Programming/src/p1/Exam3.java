package p1;

public class Exam3 
{

	public static void main(String[] args) 
	{
		try
		{
			bandMethod();
			System.out.println("A");
		}
		catch(Exception ex)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
			System.out.println("D");

	}

	 static void bandMethod() 
	{
		throw new Error();
		
	}

}
