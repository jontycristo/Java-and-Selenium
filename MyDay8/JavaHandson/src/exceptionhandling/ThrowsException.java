package exceptionhandling;

public class ThrowsException {

	public static void main(String[] args) {

		ThrowsException obj = new ThrowsException();
		// obj.add();

		System.out.println("Print after exception");

		String[] a = { "a", "s", "d", "c", "3", "4", "5", "s", "d", "f", "d", "f", "5", "5", "3" };
		int l = a.length;

		for (int i = 0; i <= l; i++) {

			boolean isInteger = isInteger(a[i]);
			if (isInteger) {
				System.out.println(a[i] + " is an integer");
			} else {
				System.out.println(a[i] + " is not an integer");
			}

		}
	}

	public static boolean isInteger(String s) {
		boolean isValidInteger = false;
		try {
			Integer.parseInt(s);

			// s is a valid integer

			isValidInteger = true;
		} catch (NumberFormatException ex) {
			// s is not an integer
		}

		return isValidInteger;
	}

	// public void add() {
	// try {
	// div();
	// } catch (Exception e) { // Exception or Throwable handle all the
	// // exceptions
	// e.printStackTrace();
	// System.out.println(e.getMessage());
	// }
}

// public void div() throws ArithmeticException {
// int a = 10 / 0;
// }

// }
