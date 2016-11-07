package per.jaga.learn;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing
		int a=0, b=1, c, i;
		
		//Printing a & b
		System.out.println(a+","+b);
		
		//looping
		for(i=2; i<=10; i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;	
			b=c;
		}
	}

}
