package p1;

import java.util.Scanner;

public class Calcualtor1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a N:");
		int a=sc.nextInt();
		System.out.println("Enter the b N:");
		int b=sc.nextInt();
		System.out.println("Choise the arithmetic function");
		String choise=sc.next();
		switch(choise)
		{
		case "+":
			int add=0;
			add=a+b;
			System.out.println("Addition "+add);
			break;  
			  
		case "-":  
			
			int sub=0;
			sub=a+b;
			System.out.println("Subtraction "+sub);
			
		 
		 break;  
		case "*":  
			int mull=0;
			mull=a+b;
			System.out.println("Multipication "+mull);
			
		 break; 
		case "/":  
			int div=0;
			div=a+b;
			System.out.println("Division "+div);
			
		 break;  
		default:     
		 System.out.println("Please try again "); 

			
			
		}
	}

}
