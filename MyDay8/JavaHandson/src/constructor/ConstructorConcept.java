package constructor;

public class ConstructorConcept {
	
	int Age;
	String Name;
	
	public ConstructorConcept(){
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("Single Parameter");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("Double Parameter");
		System.out.println(i+" "+j);
	}
	
	public ConstructorConcept(String name, int age){
		//this mean current class
		this.Name = name; //this.classvar = local variable
		this.Age = age;
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("John",20);
		
		obj.Age=45;
		obj.Name="Kite";
		System.out.println("Age: "+obj.Age);
		System.out.println("Name: "+obj.Name);
	}

}
