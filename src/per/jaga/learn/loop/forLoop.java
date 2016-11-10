package per.jaga.learn.loop;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simple for loop
		/*for(long count=2; count<=10; count+=3)
		{
			if(count==5)
			{
				continue;
			}
			System.out.println(count);
		}*/
		
		//enhanced for loop
		int array[]={10,11,12,13,14,14};
		for(int i:array)
		{
			System.out.println(i);
		}
	}

}
