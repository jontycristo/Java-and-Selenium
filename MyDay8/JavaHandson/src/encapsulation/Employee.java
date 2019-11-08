package encapsulation;

public class Employee {
	
	private int ssn;
	private String EmpName;
	private int EmpAge;
	
	// Getter and Setter methods are created

	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmpName() {
		return EmpName;
	}



	public void setEmpName(String empName) {
		EmpName = empName;
	}



	public int getEmpAge() {
		return EmpAge;
	}



	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setSsn(745858965);
		emp.setEmpName("John Mike");
		emp.setEmpAge(26);
		
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Employee Age: "+emp.getEmpAge());
		System.out.println("Employee SSN: "+emp.getSsn());

	}

}
