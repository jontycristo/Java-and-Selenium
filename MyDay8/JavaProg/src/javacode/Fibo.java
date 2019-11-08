package javacode;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b, max;
		
		a=0;
		b=1;
		max=20;
		
		for(int i=1; i<max; i++ )
		{
		
			int sum = a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		
		}
		
	}

}
