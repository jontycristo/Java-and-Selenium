package constructor;

public class B extends A {

	public B() {

		super(); //Super keyword will the first line of any child constructor
		System.out.println("Child Class Constructor");
	}

	public B(int i) {

		super(i);
		System.out.println("Child Class Constructor");
	}

	public B(int i, int j) {

		super(i, j);
		System.out.println("Child Class Constructor");
	}

	public static void main(String Args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(25, 50);
	}

}
