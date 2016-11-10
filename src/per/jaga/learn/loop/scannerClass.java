
package per.jaga.learn.loop;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a= new Scanner (System.in);
		
		System.out.println("Please enter your marks: ");
		int mark= a.nextInt();
		
		if (mark <35)
		{
			System.out.println("Exam result: Fail!");
		}

		else if (mark >=35 && mark < 50)
		{
			System.out.println("Exam Result: Grade D");
		}
		
		else if (mark >=50 && mark < 65)
		{
			System.out.println("Exam Result: Grade C");
		}
		
		else if (mark >=65 && mark <=80)
		{
			System.out.println("Exam Result: Grade B");
		}
		
		else if (mark >=81 && mark <=100)
		{
			System.out.println("Exam Result: Grade A");
		}
		
		else
		{
			System.out.println("Invalid input!");
		}

	}

}
