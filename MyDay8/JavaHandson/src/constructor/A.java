package constructor;

public class A {
	
	public A(){
		System.out.println("Default Constructor Parent Class");
	}
	
	public A(int i){
		System.out.println("Parent Constructor A, Value of i: "+i);
	}
	
	public A(int i, int j){
		System.out.println("Parent Constructor A, Value of i: "+i);
		System.out.println("Parent Constructor A, Value of j: "+j);
	}

}
