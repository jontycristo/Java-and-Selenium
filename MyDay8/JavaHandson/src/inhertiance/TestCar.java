package inhertiance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BMW a = new BMW();
		a.Start(); //Method Overridding (Static Polymorphsm or Compile time polymorphism  )
		a.Stop(); //ParentClass -- Car
		a.Refuel(); //ParentClass -- Car
		a.HealthSafety(); //ChildClass -- BMW class
		a.Engine();

		System.out.println("=======================================");
		
		Car c = new Car();
		c.Start(); //Parent Cannot access child class method
		c.Stop();
		c.Refuel();
		c.Engine();
		
		System.out.println("=======================================");
		
		//Top Casting
		Car c1 = new BMW(); // Child class object can be referred by parent class reference variable -- Dynamic Polymorphism or Run Time Polymorphism
		c1.Start();
		c1.Stop();
		c1.Refuel();
		c1.Engine();
		
		//Down Casting
		BMW b1 = (BMW) new Car();
		
		
	}

}
