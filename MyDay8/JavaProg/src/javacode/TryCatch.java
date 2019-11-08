package javacode;

public class TryCatch {
	

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			
			int c = a / b;
			 
			System.out.println("C: "+c);
		} 
		
		catch (ArithmeticException e) {
			// TODO: handle finally clause
			System.out.println("Executed with Finally block: "+e);
		} 

	}

}
