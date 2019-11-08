package interfacehandson;

public interface USBank {
	
	//Only Method declaration in Interface
	//no method body -- only prototype
	//In Interface we can declare variables  and variables are static in nature
	//Variables values will not be changed
	//we cannot have static method in Interface
	//no main method in Interface
	//We cannot create object for Interface
	//Interface is abstract in nature
	
	int minBal = 100;
	
	public void credit();
	public void savings();
	public void loan();
	public void interestRate();
	  
}
