package spring_core_y.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core_y.test.Student;

public class Main {

	public static void main(String[] args) {
		String path = "spring_core_y/autowiring/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
	
		Worker worker1 = context.getBean("w1", Worker.class);
		System.out.println(worker1);

	}

}
