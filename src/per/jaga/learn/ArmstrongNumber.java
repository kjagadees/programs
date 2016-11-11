package per.jaga.learn;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner (System.in);
		
		System.out.println("Please enter the number: ");
		int n= s.nextInt();
		
		int temp=n;
		int r, sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum= sum + r*r*r;			
		}
		
		if(temp==sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not an Armstrong");		
		
	}

}
