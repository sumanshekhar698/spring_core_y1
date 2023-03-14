package spring_core_y.constructor_injections;

public class Addition {

	private int a;
	private int b;

	public Addition(int a, int b) {
		super();
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		this.a = a;
		this.b = b;
	}

	void sum() {
		System.out.println("SUM ==> " + this.a + this.b);
	}

}
