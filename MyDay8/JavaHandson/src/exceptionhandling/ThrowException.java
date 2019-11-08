package exceptionhandling;

public class ThrowException {

	public static void main(String[] args) {

		// Throw exception is customize exception used for handling exceptions

		System.out.println("Hello Java");

		try {
			throw new Exception("Customize Exception");
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Hello world");

		String Exe_Flag = "";

		if (Exe_Flag.equals(" ") || Exe_Flag.equals("")) {

			try {
				throw new Exception("Execution Run Flag cannot be Null or Blank");
			} catch (Exception e) {

				e.printStackTrace();
			}

		} else {
			System.out.println("Execution Started");
		}

	}

}
