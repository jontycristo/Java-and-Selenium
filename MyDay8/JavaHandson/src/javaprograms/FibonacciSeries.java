package javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		int a = 0;
		int b = 1;
		for (int i = 0; i <= n; i++) {
			int sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}

}
