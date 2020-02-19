package p1;

import java.io.FileInputStream;

public class Exam4 
{

	public static void main(String[] args) 
	{
		FileInputStream out=null;
		try
		{
			out=new FileInputStream("test.le");
			out.wait(122);	
		}
		catch(Exception io)
		{
			//finally
			{
				//out.close();
				
			}
		}

	}

}
