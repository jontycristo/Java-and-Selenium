
public class JavaForLoop {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0; i<=100;i++)
		{
	
			sum=sum+i;
			
		}
		System.out.println("Sum of 1-100: "+sum);
		
		
		for(int i=1; i<=9;i++)
		{
			for (int j=0; j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=0; i<=4;i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
