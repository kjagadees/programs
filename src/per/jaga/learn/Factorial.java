package per.jaga.learn;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,factorial=1, number;
		
		Scanner s= new Scanner(System.in); //scanner class to get the input runtime
		System.out.println("Enter the number: ");
		number=s.nextInt();
				
		for (i=1; i<=number; i++) 
		{
			factorial=factorial*i;
		}
		
		System.out.println("the factorial is: "+factorial);			
		
	}

}
