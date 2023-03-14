package spring_core_y.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core_y.test.Student;

public class Main {

	public static void main(String[] args) {
		String path = "spring_core_y/spel/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		Demo d1 = context.getBean("demo", Demo.class);

		Demo d2 = context.getBean("demo", Demo.class);
		//Spring by default foolows Singeloton pattern
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

	}

}
