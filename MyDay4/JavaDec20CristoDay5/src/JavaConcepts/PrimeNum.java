package JavaConcepts;

public class PrimeNum {

	public static void main(String[] args) {
		int a=0;
		for(int i=3; i<=100;i++)
		{
			for(int j=i-1; j<i;j++)
			{
				
			if(i/j==0)
			{
				System.out.println("Not a Prime Number: "+a);
			}
			else
			{
				System.out.println("Prime Number: "+a);
			}
		}

	}
		
	}

}