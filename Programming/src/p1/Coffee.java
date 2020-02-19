package p1;

import java.util.Scanner;

public class Coffee
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("inter the item");
		int prize=0;
		String item=sc.nextLine();
		System.out.println("enter the quntity");
		int n=sc.nextInt();
		switch(item)
		{    
		case "Coffe":
			System.out.println("Coffe");
			
			prize=10*n;
			System.out.println(" prize  "+prize);
			
		   
		 break;  
  
		case "Black coffe":  
			System.out.println(" Black Coffe");
			
			prize=150*n;
			System.out.println(" prize  "+prize);
		 
		 break;  
		case "cold coffe":  
			System.out.println(" Cold Coffe");
			
			prize=50*n;
			System.out.println(" prize  "+prize);
		 
		 break;  
		case "Americano coffe":  
			System.out.println(" Americano Coffe");
			
			prize=200*n;
			System.out.println(" prize  "+prize);
		 
		 break;  
		case "Milk coffe":  
			System.out.println(" Millk Coffe");
			
			prize=200*n;
			System.out.println(" prize  "+prize);
		 
		 break;  
		
		    
		default:     
		 System.out.println("No item "); 
		}  

	}

}
