package finallyKeyword;

public class FinallyConcept {

	public static void main(String[] args) {

		// add();
		div();
	}

	public static void add() {
		try {
			System.out.println("Inside Try block");
		} catch (Exception e) {
			System.out.println("Inside Catch block");
		} finally {
			System.out.println("Inside finally block");
		}
	}

	public static void div() {
		int i = 10;
		try {
			System.out.println("Try--Div");
			int k = i / 0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Inside Catch block");
		}

		finally {
			System.out.println("Finally execute this code");
		}
	}
}
