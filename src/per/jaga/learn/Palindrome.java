package per.jaga.learn;

import java.util.Scanner;

// Palindrome for numbers
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		
		Scanner s = new Scanner(System.in);
		int number= s.nextInt();
		int original=number;
		
		//reversing the number
		int reverse=0, reminder;
		
		while (number>0)
		{
			reminder= number%10;
			reverse=reverse*10 + reminder;
			number=number/10;
		}
		
		if(reverse ==original)
		
			System.out.println("The number is a palindrome");
		
		else
			
			System.out.println("The number is not a palindrome");

	}

}
