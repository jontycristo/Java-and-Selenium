package javacode;

public class JavaPracs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("====================================");
		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);

		System.out.println("====================================");

		int num1 = 10;
		for (; num1 >= 1;) {
			num1 = num1 - 1;
			System.out.println(num1);

		}
	}
}