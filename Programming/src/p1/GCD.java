package p1;

public class GCD 
{

	public static void main(String[] args) 
	{

		 int a, b;
	      int[] myArray = {1,2,3,4,5};
	      int size = myArray.length;
	      int result = myArray[0];
	      int i = 1;
	      while(i<size)
	      {
	         if(myArray[i]%result==0)
	         {
	            i++;
	         } else {
	            result = myArray[i]%result;
	            i++;
	         }
	      }
	      System.out.println("GCD is "+result);
	   }


	}


