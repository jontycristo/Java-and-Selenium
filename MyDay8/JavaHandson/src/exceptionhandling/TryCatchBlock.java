package exceptionhandling;

public class TryCatchBlock {

	public int add() {

		int a = 10;
		int b = 5;
		int c = a + b;
		return c;
	}

	public int div() {
		int a = 10 / 0;
		return a;
	}

	public static void main(String[] args) {

		try {

			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.add();

			TryCatchBlock obj1 = new TryCatchBlock();
			obj1.div();

		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Executed Successfully");

	}

}
