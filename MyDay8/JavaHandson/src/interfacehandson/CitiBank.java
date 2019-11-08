package interfacehandson;

public class CitiBank implements USBank, BrazilBank{

	@Override
	public void credit() {
		System.out.println("Citi Bank Credit");
		
	}

	@Override
	public void savings() {
		System.out.println("Citi Bank Saving Account");
		
	}

	@Override
	public void loan() {
		System.out.println("Citi Bank Loan");
		
	}

	@Override
	public void interestRate() {
		System.out.println("Citi Bank Interest Rate");
		
	}

	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		
	}

	public static void CarLoan(){
		System.out.println("CitiBank CarLoan");
	}

}
