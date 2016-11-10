package per.jaga.learn.loop;

import java.util.Scanner;

public class switchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner (System.in);
			
		System.out.println("Please choose your operation: ");
		int choice= s.nextInt();
		
		switch(choice)
		{
		
		case 1:
			
			System.out.println("Enter the value for Addition");
						
			int a= s.nextInt();
			int b= s.nextInt();
			
			System.out.println("The result is " +(a+b));
			
			//break;
			
		case 2: 
			
			System.out.println("Enter the value for subtraction");
			
			int c= s.nextInt();
			int d= s.nextInt();
			
			System.out.println("The result is " +(c-d));
			
			//break;
			
		}

	}
}
