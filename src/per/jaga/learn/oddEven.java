package per.jaga.learn;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("Enter the number to test: ");
		
		Scanner s = new Scanner (System.in);
		a= s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		
		
		
		
	}

}
