package encapsulation1;

public class Car {
	
	private static int tyres;
	private static String model;
	
	public void Bike(){
		tyres = 2;
		model = "Cycle";
		
		System.out.println("Bike Tyres: "+tyres);
		System.out.println("Bike Model: "+model);
	}
	
	public void car(){
		tyres = 4;
		model = "SUV";
		System.out.println("Car Tyres: "+tyres);
		System.out.println("Car Model: "+model);
	}

	public static int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		 this.tyres = tyres;
	}

	public static String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

}
