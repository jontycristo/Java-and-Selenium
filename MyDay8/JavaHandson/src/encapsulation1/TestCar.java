package encapsulation1;

public class TestCar extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.Bike();
		c.car();
		c.setTyres(5);
		c.setModel("Racer");
		System.out.println("Tyres: "+getTyres());
		System.out.println("Model: "+getModel());
		

	}

}
