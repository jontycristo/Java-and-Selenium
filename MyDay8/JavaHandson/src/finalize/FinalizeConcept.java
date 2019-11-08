package finalize;

public class FinalizeConcept {
	
	public void finalize(){
		System.out.println("Cleaned the memory");
	}

	public static void main(String[] args) {
		FinalizeConcept fb = new FinalizeConcept();
		FinalizeConcept fb1 = new FinalizeConcept();
		FinalizeConcept fb2 = new FinalizeConcept();
		
		new FinalizeConcept();
		fb=null;
		fb1=null;
		fb2=null;
		
		System.gc();

	}

}
