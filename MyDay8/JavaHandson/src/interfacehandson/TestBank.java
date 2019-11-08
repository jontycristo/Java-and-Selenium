package interfacehandson;

public class TestBank {

	public static void main(String[] args) {
		
		CitiBank c = new CitiBank();
		
		c.credit();
		c.loan();
		c.savings();
		c.mutualfund();
		
		USBank a = new CitiBank();
		a.credit();
		a.savings();
		System.out.println(USBank.minBal);

	}

}
