package spring_core_y.test;

public class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		System.out.println("Student(String name, int age)");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName called");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge called");
		this.age = age;
	}

	public Student() {//must create a default constructor for Spring to manage
		super();
		System.out.println("Student() called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
