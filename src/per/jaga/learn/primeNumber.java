package per.jaga.learn;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, m=0, flag=0;
		
		int n=17; //input to check 
		m=n/2;
		
		for(i=2; i<=m; i++)
		{
			if(n%2==0)
			{
				System.out.println("the number is not a prime number");
				flag=1;
				break;
			}
			
			if(flag==0){
				System.out.println("The number is prime");
				break;
			}
			
			
		}

	}

}
