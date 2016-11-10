package per.jaga.learn.loop;

public class innerForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=3; j++)
			{
				if(i==2 && j==2)
				{
					continue;
				}
				
				System.out.println(i+ " " +j);
			}
			
		}*/
		
		
		int a=0, b=1, count, c;
		
		System.out.println(a+" " +b);
		
		for(count=2; count<=6; count++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
