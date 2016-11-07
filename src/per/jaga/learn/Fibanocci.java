package per.jaga.learn;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Checking
		int a=0, b=1, c, i;
		
		System.out.println(a+" "+b);
		
		for(i=2; i<=10; i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;	
			b=c;
		}
	}

}
